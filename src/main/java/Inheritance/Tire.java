package Inheritance;

public class Tire extends Part{
    private double rozmiar;
    private double szerokosc;

    public Tire(double rozmiar, double szerokosc) {
        this.rozmiar = rozmiar;
        this.szerokosc = szerokosc;
    }

    public double getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(double rozmiar) {
        this.rozmiar = rozmiar;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public void printInfo() {
        System.out.println(getNumerIdentyfikacyjny() + " " + getNazwaProducenta() + " " + getModel() + " " + getSeriaProduktu() + " " + getRozmiar() + " " + getSzerokosc());
    }
}
