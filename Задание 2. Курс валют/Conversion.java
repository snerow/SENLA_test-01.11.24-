public abstract class Conversion {
    protected static double RUB;  // Доллар США
    protected static double USD;  // Доллар США
    protected static double EUR;  // Евро
    protected static double CNY;  // Китайский юань
    protected static double KZT;  // Казахстанских тенге
    protected static double TRY;  // Турецких лир

    private final double money;
    private final String currencyName;

    public Conversion(double convertMoney, String currName) {
        this.money = convertMoney;
        this.currencyName = currName;
    }

    public abstract void convert();

    protected void convertToRUB() {
        double moneyRUB = money / RUB;
        System.out.println("Сумма " + money + " " + currencyName + " в RUB: " + moneyRUB);
    }

    protected void convertToUSD() {
        double moneyUSD = money / USD;
        System.out.println("Сумма " + money + " " + currencyName + " в USD: " + moneyUSD);
    }

    protected void convertToEUR() {
        double moneyEUR = money / EUR;
        System.out.println("Сумма " + money + " " + currencyName + " в EUR: " + moneyEUR);
    }

    protected void convertToCNY() {
        double moneyCNY = money / CNY;
        System.out.println("Сумма " + money + " " + currencyName + " в CNY: " + moneyCNY);
    }

    protected void convertToKZT() {
        double moneyKZT = money / KZT;
        System.out.println("Сумма " + money + " " + currencyName + " в KZT: " + moneyKZT);
    }

    protected void convertToTRY() {
        double moneyTRY = money / TRY;
        System.out.println("Сумма " + money + " " + currencyName + " в TRY: " + moneyTRY);
    }

    protected void setRUB(double currency) {
        RUB = currency;
    }

    protected void setUSD(double currency) {
        USD = currency;
    }

    protected void setEUR(double currency) {
        EUR = currency;
    }

    protected void setCNY(double currency) {
        CNY = currency;
    }

    protected void setKZT(double currency) {
        KZT = currency;
    }

    protected void setTRY(double currency) {
        TRY = currency;
    }
}
