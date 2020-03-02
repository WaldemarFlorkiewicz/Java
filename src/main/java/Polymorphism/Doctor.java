package Polymorphism;

public class Doctor extends Person {

    private double premia;

    public Doctor(String imie, String nazwisko, double wyplata, double premia) {
        super(imie, nazwisko, wyplata);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    @Override
    public String info() {
        return super.info() + ", " + "Premia: " + premia;
    }

}
