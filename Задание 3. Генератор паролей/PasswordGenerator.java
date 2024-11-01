import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    private static final char[] capitalLetters = {'A','B','C','D','E','F','G','H','I','J','K',
            'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    private static final char[] lowercaseLetters = {'a','b','c','d','e','f','g','h','i','j','k',
            'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    private static final char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};

    private static final char[] symbols = {'~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_',
            '=','+','[',']','{','}','|',';',':',',','<','.','>','/','.','?','№'};

    private int numOfCharactersInPassword;
    private final List<Character> password = new ArrayList<>();


    public PasswordGenerator() {}

    public int getNumOfCharactersInPassword() {
        return numOfCharactersInPassword;
    }

    public String getPassword() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите кол-во символов в пароле (от 8 до 12): ");
            numOfCharactersInPassword = sc.nextInt();
            sc.nextLine();
            if (numOfCharactersInPassword < 8 || numOfCharactersInPassword > 12) {
                System.out.println("Некорректный ввод данных. Введите значение снова.");
            }
            else {
                break;
            }
        }

        generatePassword();

        return getStringPassword();
    }

    private void generatePassword() {
        List<Integer> reservedCharacter = new ArrayList<>();
        int rand = new Random().nextInt(numOfCharactersInPassword);

        reservedCharacter.add(rand);

        while (reservedCharacter.size() < 4) {
            rand = new Random().nextInt(numOfCharactersInPassword);
            if (!reservedCharacter.contains(rand))
                reservedCharacter.add(rand);
        }

        for (int i = 0; i < numOfCharactersInPassword; i++) {
            if (reservedCharacter.get(0) == i) {
                rand = new Random().nextInt(capitalLetters.length);
                password.add(capitalLetters[rand]);
            }
            else if (reservedCharacter.get(1) == i){
                rand = new Random().nextInt(lowercaseLetters.length);
                password.add(lowercaseLetters[rand]);
            }
            else if (reservedCharacter.get(2) == i){
                rand = new Random().nextInt(numbers.length);
                password.add(numbers[rand]);
            }
            else if (reservedCharacter.get(3) == i){
                rand = new Random().nextInt(symbols.length);
                password.add(symbols[rand]);
            }
            else {
                rand = new Random().nextInt(4);
                if (rand == 0) {
                    rand = new Random().nextInt(capitalLetters.length);
                    password.add(capitalLetters[rand]);
                }
                if (rand == 1) {
                    rand = new Random().nextInt(lowercaseLetters.length);
                    password.add(lowercaseLetters[rand]);
                }
                if (rand == 2) {
                    rand = new Random().nextInt(numbers.length);
                    password.add(numbers[rand]);
                }
                if (rand == 3) {
                    rand = new Random().nextInt(symbols.length);
                    password.add(symbols[rand]);
                }
            }
        }
    }

    private String getStringPassword() {
        StringBuilder pass = new StringBuilder();

        for (Character character : password) {
            pass.append(character);
        }

        return pass.toString();
    }
}
