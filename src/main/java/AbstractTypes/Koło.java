package AbstractTypes;

public class Koło implements Ksztalt {

    private double r;

    public Koło(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczPowierzchnie() {
        return Ksztalt.PI * r * r;
    }

    @Override
    public double obliczObwod() {
        return 2 * Ksztalt.PI * r;
    }
}
