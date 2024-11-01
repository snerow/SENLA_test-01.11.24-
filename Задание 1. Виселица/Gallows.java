import java.util.Random;
import java.util.Scanner;

public class Gallows {
    private static final String[] easyWords = {"HELLO", "SENLA", "YOU", "ARE", "THE", "BEST"};
    private static final String[] normalWords = {"AIRBUS", "MAKEUP", "LIBRARY", "HOBBIT", "OPOSSUM",
            "UNIFORM", "ABSOLUTE", "SENTENCE"};
    private static final String[] hardWords = {"ADVENTURE", "EVERYTHING", "TECHNOLOGY",
            "CONFIDENCE", "HYPOTHETICAL", "SATISFACTION", "CELEBRATION", "DISTRACTION",
            "ACCOMPLISH"};


    public Gallows() {}

    public void startGame() {   // Данный метод позволяет начать игру и получить искомое слово
        Scanner sc = new Scanner(System.in);

        int difficultyLevel;
        boolean isRightInput = false;
        StringBuilder word = new StringBuilder();

        while (!isRightInput) {
            System.out.println("Добро пожаловать в игру Виселица!\n");
            System.out.println("Выберите уровень сложности:");
            System.out.println("1 - простой уровень");
            System.out.println("2 - средний уровень");
            System.out.println("3 - сложный уровень");
            System.out.print("Выбор: ");
            difficultyLevel = sc.nextInt();
            sc.nextLine();  // Очищаем сканер

            switch (difficultyLevel) {
                case 1:
                    word.append(chooseEasyLevel());
                    isRightInput = true;
                    break;
                case 2:
                    word.append(chooseNormalLevel());
                    isRightInput = true;
                    break;
                case 3:
                    word.append(chooseHardLevel());
                    isRightInput = true;
                    break;
                default:
                    System.out.println("Неправильный ввод. Попробуйте снова!");
                    break;
            }
        }

        continuePlaying(word.toString());

        sc.close();
    }

    private void continuePlaying(String word) { // Основная механика игры осуществляется в этом методе
        Scanner sc = new Scanner(System.in);
        char letter;

        GallowsPoses poses = new GallowsPoses();
        WordString wordString = new WordString(word);

        System.out.println("-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\nНынешняя виселица:");
        poses.printPose();
        wordString.printInfo();

        while (poses.getPoseLevel() != 9 && !wordString.isWordGuessed()) {
            System.out.println("-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Введите букву (латиница, заглавные):\t");
            letter = sc.nextLine().charAt(0);

            if (!wordString.isLetterConsists(letter))
                poses.increasePoseLevel();

            poses.printPose();
            wordString.printInfo();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-");

        if (poses.getPoseLevel() == 9) {
            System.out.println("\n-=YOU DIED=-\n");
            poses.printPose();
            System.out.println("- это моё настроение, если вы меня не возьмёте к вам в тёплую компанию :'с");
        }
        else {
            System.out.println("\nПОЗДРАВЛЯЕМ С ПОБЕДОЙ!!!\n");
            System.out.println("Угадываемым словом было: " + wordString.getWord());
            System.out.println("Кол-во промохов:         " + wordString.getNumOfMissed());
        }

        sc.close();
    }

    private String chooseEasyLevel() {
        int wordNumber = new Random().nextInt(6);
        return easyWords[wordNumber];
    }

    private String chooseNormalLevel() {
        int wordNumber = new Random().nextInt(8);
        return normalWords[wordNumber];
    }

    private String chooseHardLevel() {
        int wordNumber = new Random().nextInt(10);
        return hardWords[wordNumber];
    }
}
