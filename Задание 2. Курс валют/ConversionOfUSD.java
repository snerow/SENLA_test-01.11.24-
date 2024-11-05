public class ConversionOfUSD extends Conversion{
    public ConversionOfUSD(double convertMoney) {
        super(convertMoney, "Долларов США");
        setRUB(0.01026272578);  // Рубли
        setEUR(1.08695652174);  // Евро
        setCNY(0.14025245441);  // Китайский юань
        setKZT(0.00204365241);  // Казахстанских тенге
        setTRY(0.02911208151);  // Турецких лир
    }

    @Override
    public void convert() {
        System.out.println("Итог конвертации:");
        convertToRUB();
        convertToEUR();
        convertToCNY();
        convertToKZT();
        convertToTRY();
    }
}
