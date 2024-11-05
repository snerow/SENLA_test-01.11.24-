public class ConversionOfEUR extends Conversion{
    protected ConversionOfEUR(double convertMoney) {
        super(convertMoney, "Евро");
        setRUB(0.00942151874);  // Рубли
        setUSD(0.91743119266);  // Доллар США
        setCNY(0.12886597938);  // Китайский юань
        setKZT(0.00188284912);  // Казахстанских тенге
        setTRY(0.02683123155);  // Турецких лир
    }

    @Override
    public void convert() {
        System.out.println("Итог конвертации:");
        convertToRUB();
        convertToUSD();
        convertToCNY();
        convertToKZT();
        convertToTRY();
    }
}
