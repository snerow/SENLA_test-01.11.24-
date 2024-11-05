public class ConversionOfKZT  extends Conversion{
    protected ConversionOfKZT(double convertMoney) {
        super(convertMoney, "Казахстанских тенге");
        setRUB(5);       // Рубли
        setUSD(488.11);  // Доллар США
        setEUR(531.11);  // Евро
        setCNY(68.42);   // Китайский юань
        setTRY(14.25);   // Турецких лир
    }

    @Override
    public void convert() {
        System.out.println("Итог конвертации:");
        convertToRUB();
        convertToUSD();
        convertToEUR();
        convertToCNY();
        convertToTRY();
    }
}
