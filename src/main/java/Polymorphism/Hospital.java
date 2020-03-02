package Polymorphism;

public class Hospital {
    private static final int MAX_PRACOWNIKOW = 3;
    private Person[] pracownicy = new Person[MAX_PRACOWNIKOW];
    private static int sum = 0;


    public void dodajPracownika(Person person) {
        if (sum < MAX_PRACOWNIKOW) {
            pracownicy[sum] = person;
            sum++;
        } else
            System.out.println("Nie ma wiecej miejsc.");
    }

    public Person dodajDoktora(String name, String lastName, double wypłata, double premia){
        return new Doctor(name, lastName, wypłata,premia);

    }



    public void wyswietlPracownikow() {
        for (int i = 0; i < sum; i++) {
            System.out.println(pracownicy[i].info());
        }
    }

}
