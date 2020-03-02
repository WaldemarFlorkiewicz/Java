package AbstractTypes;

public class Trojkat implements Ksztalt {

    private double a;
    private double b;
    private double c;
    private double h;


    public Trojkat(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    @Override
    public double obliczPowierzchnie() {
        return (a * h) / 2;
    }

    @Override
    public double obliczObwod() {
        return a + b + c;
    }
}

