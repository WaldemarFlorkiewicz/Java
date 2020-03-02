package Polymorphism;

public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.dodajPracownika(new Doctor("Tomasz", "Nowak", 24000, 2300));
        hospital.dodajPracownika(new Nurse("Kinga", "Kowalczyk", 2400, 4));
        hospital.dodajPracownika(new Nurse("Ilona", "Krasnik", 2300, 6));

        hospital.wyswietlPracownikow();

    }
}
