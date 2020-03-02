package KlasyIObiekty;

public class Company {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.imie = "Tomasz";
        employee1.nazwisko = "Kowalczyk";
        employee1.rokUrodzenia = "12/12/2000";
        employee1.stażPracyWLatach = 2;
        Employee employee2 = new Employee();
        employee2.imie = "Waldemar";
        employee2.nazwisko = "Florkiewicz";
        Employee employee3 = new Employee();
        employee3.imie = "Edyta";
        employee3.nazwisko = "Nowak";

        System.out.println(employee3.nazwisko + employee3.imie);

    }
}
