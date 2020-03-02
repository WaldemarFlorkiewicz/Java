package ConstructionSuper;

public class Apple extends Fruit {

    private static final String TYP = "Jabłkowy" ;
    private String odmiana;

    public Apple(double wagaWGramach, String odmiana) {
        super(wagaWGramach, TYP);
        this.odmiana = odmiana;
    }

    public String getOdmiana() {
        return odmiana;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " " + odmiana;
    }
}
