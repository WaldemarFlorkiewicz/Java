package Inheritance;

public class Test {
    public static void main(String[] args) {

        Tire tire = new Tire(17,225);
        tire.setModel("px20");
        tire.setNazwaProducenta("Continental");
        tire.setSeriaProduktu("1");
        tire.setNumerIdentyfikacyjny("123");
        tire.printInfo();

        ExhaustPart exhaustPart = new ExhaustPart(true);
        exhaustPart.setModel("px20");
        exhaustPart.setNazwaProducenta("Continental");
        exhaustPart.setSeriaProduktu("1");
        exhaustPart.setNumerIdentyfikacyjny("123");
        exhaustPart.printInfo();
    }

}
