package EnkapsulacjaIHermetyzacja;

public class PrintService {

    public void wyswietlanieWiadomosci (Client client, double price, double discount){
        printOnScreenn(client);
        printPrices(price, discount);
    }

    private void printOnScreenn (Client client){
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        if (lastName == null && firstName != null){
            System.out.println("Witaj " + firstName);
        }else if (firstName != null && lastName != null){
            System.out.println("Witaj " + firstName + " " + lastName);
        }else if (firstName == null && lastName != null){
            System.out.println("Witaj " + lastName);
        }else
            System.out.println("Witaj nieznajomy");
    }

    private void printPrices (double price, double discount){
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Kowota po rabacie: " + discount);
    }


}
