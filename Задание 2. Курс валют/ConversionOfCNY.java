public class ConversionOfCNY  extends Conversion{
    protected ConversionOfCNY(double convertMoney) {
        super(convertMoney, "Китайских юаней");
        setRUB(0.07315288953);  // Рубли
        setUSD(7.14285714286);  // Доллар США
        setEUR(7.69230769231);  // Евро
        setKZT(0.01447178002);  // Казахстанских тенге
        setTRY(0.20618556701);  // Турецких лир
    }

    @Override
    public void convert() {
        System.out.println("Итог конвертации:");
        convertToRUB();
        convertToUSD();
        convertToEUR();
        convertToKZT();
        convertToTRY();
    }
}
