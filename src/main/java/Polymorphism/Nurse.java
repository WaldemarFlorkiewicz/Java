package Polymorphism;

public class Nurse extends Person{

    private int nadgodziny;

    public Nurse(String imie, String nazwisko, double wyplata, int nadgodziny) {
        super(imie, nazwisko, wyplata);
        this.nadgodziny = nadgodziny;
    }

    public int getNadgodziny() {
        return nadgodziny;
    }

    @Override
    public String info() {
        return super.info() + ", " + "Nadgodziny: " + nadgodziny;
    }
}
