package AgregacjaIKompozycja;

public class Bank {
    public static void main(String[] args) {
        Address address = new Address();
        address.kodPocztowy = "12-120";
        address.miejscowosc = "Warszawa";

        Person person = new Person();
        person.livingAddress = address;
        person.sendAddress = new Address();
        person.sendAddress.miejscowosc = "Warszawa";
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "12134141";

        BankAccount bankAccount = new BankAccount();
        bankAccount.owner = person;
        bankAccount.balance = 120000.12;

        Credit credit = new Credit();
        credit.address.miejscowosc = "Lolek";
        credit.borrower = person;
        credit.cashBorrowed = 121212;
        credit.termMonths = 36;

        System.out.println(address.miejscowosc);
    }
}
