public class ConversionOfTRY  extends Conversion{
    protected ConversionOfTRY(double convertMoney) {
        super(convertMoney, "Турецких лир");
        setRUB(0.35087719298);  // Рубли
        setUSD(34.25);  // Доллар США
        setEUR(37.27);  // Китайский юань
        setCNY(4.7619047619);  // Казахстанских тенге
        setKZT(0.06949270326);  // Турецких лир
    }

    @Override
    public void convert() {
        System.out.println("Итог конвертации:");
        convertToRUB();
        convertToUSD();
        convertToEUR();
        convertToCNY();
        convertToKZT();
    }
}
