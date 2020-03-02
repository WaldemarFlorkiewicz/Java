package MethodsAndConstructors.Cwiczenie2;

public class Test {
    public static void main(String[] args) {

        PrzeliczanieCzasu przeliczanieCzasu = new PrzeliczanieCzasu();
        //int hours = 14;
        //int minuty = przeliczanieCzasu.godzinyNaMinuty(14);
        //int sekundy = przeliczanieCzasu.minuityNaSekundy(minuty);
        //int milisekundy = przeliczanieCzasu.sekundyNaMilisekundy(sekundy);
        //System.out.println(milisekundy);
        int miliSekundyZ14Gdzin = przeliczanieCzasu.sekundyNaMilisekundy(przeliczanieCzasu.minuityNaSekundy(przeliczanieCzasu.godzinyNaMinuty(14)));
        System.out.println(miliSekundyZ14Gdzin);
    }
}
