package Encapsulation;

public class DiscountApp {
    public static void main(String[] args) {

        PrintService printService = new PrintService();

        Client client1 = new Client(null, null, true);
        double price1 = 1100;

        Client client2 = new Client("Tomasz", "Nowak", false);
        double price2 = 1100;

        DiscountService discountService = new DiscountService();

        printService.wyswietlanieWiadomosci(client1, price1, discountService.calculateDiscountPrice(client1, price1) );
        printService.wyswietlanieWiadomosci(client2, price2, discountService.calculateDiscountPrice(client2, price2));
    }
}
