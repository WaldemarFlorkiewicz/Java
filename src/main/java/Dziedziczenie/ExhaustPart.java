package Dziedziczenie;

public class ExhaustPart extends Part{

    private boolean europejskiStandard;

    public ExhaustPart(boolean europejskiStandard) {
        this.europejskiStandard = europejskiStandard;
    }

    public boolean isEuropejskiStandard() {
        return europejskiStandard;
    }

    public void setEuropejskiStandard(boolean europejskiStandard) {
        this.europejskiStandard = europejskiStandard;
    }

    public void printInfo(){
        System.out.println(getNumerIdentyfikacyjny() + " " + getNazwaProducenta() + " " + getModel() + " " + getSeriaProduktu() + " " + isEuropejskiStandard());
    }
}
