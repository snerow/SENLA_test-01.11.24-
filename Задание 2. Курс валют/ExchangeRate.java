import java.util.Scanner;

public class ExchangeRate {
    public ExchangeRate() {}

    public void convert() {
        Scanner sc = new Scanner(System.in);
        boolean isRightInput = false;
        short selectedCurrency = 0;     // Эта переменная не будет использоваться в программе со значением 0.
                                        // Поставил 0, ибо IntelliJ IDEA ругается

        while (!isRightInput) {
            System.out.println("Выберите валюту, которую будете конвертировать:");
            System.out.println("1 - Рубли;");
            System.out.println("2 - Доллар США;");
            System.out.println("3 - Евро;");
            System.out.println("4 - Китайский юань;");
            System.out.println("5 - Казахстанский тенге;");
            System.out.println("6 - Турецких лир.");
            System.out.print("Выбор валюты: ");
            selectedCurrency = sc.nextShort();
            sc.nextLine();

            if (selectedCurrency >= 1 && selectedCurrency <= 6) {
                isRightInput = true;
            }
            else {
                System.out.println("Неправильный ввод. " +
                                    "Пожалуйста, введите в категорие Выбор валюты значение от 1 до 6.\n");
            }
        }

        System.out.println("\nВведите сумму конвертации:\t");
        double money = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        switch (selectedCurrency) {
            case 1:
                ConversionOfRUB conRUB = new ConversionOfRUB(money);
                conRUB.convert();
                break;
            case 2:
                ConversionOfUSD conUSD = new ConversionOfUSD(money);
                conUSD.convert();
                break;
            case 3:
                ConversionOfEUR conEUR = new ConversionOfEUR(money);
                conEUR.convert();
                break;
            case 4:
                ConversionOfCNY conCNY = new ConversionOfCNY(money);
                conCNY.convert();
                break;
            case 5:
                ConversionOfKZT conKZT = new ConversionOfKZT(money);
                conKZT.convert();
                break;
            case 6:
                ConversionOfTRY conTRY = new ConversionOfTRY(money);
                conTRY.convert();
                break;
        }

        sc.close();
    }
}
