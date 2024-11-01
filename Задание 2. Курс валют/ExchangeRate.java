import java.util.Scanner;

public class ExchangeRate {
    private static final double USD = 97.4402;  // Доллар США
    private static final double EUR = 105.8415; // Евро
    private static final double CNY = 13.6394;  // Китайский юань
    private static final double KZT = 19.9566;  // Казахстанских тенге
    private static final double TRY = 28.4834;    // Турецких лир


    public ExchangeRate() {}

    public void convert() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму в рублях:\t");
        double money = sc.nextDouble();
        System.out.println();

        convertToUSD(money);
        convertToEUR(money);
        convertToCNY(money);
        convertToKZT(money);
        convertToTRY(money);

        sc.close();
    }

    private void convertToUSD(double money) {
        double moneyUSD = money / USD;
        System.out.println("Сумма " + money + " рублей в USD: " + moneyUSD);
    }

    private void convertToEUR(double money) {
        double moneyUSD = money / EUR;
        System.out.println("Сумма " + money + " рублей в EUR: " + moneyUSD);
    }

    private void convertToCNY(double money) {
        double moneyUSD = money / CNY;
        System.out.println("Сумма " + money + " рублей в CNY: " + moneyUSD);
    }

    private void convertToKZT(double money) {
        double moneyUSD = money / KZT;
        System.out.println("Сумма " + money + " рублей в KZT: " + moneyUSD);
    }

    private void convertToTRY(double money) {
        double moneyUSD = money / TRY;
        System.out.println("Сумма " + money + " рублей в TRY: " + moneyUSD);
    }
}
