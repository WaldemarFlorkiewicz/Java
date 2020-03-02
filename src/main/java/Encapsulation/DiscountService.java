package Encapsulation;

public class DiscountService {

    public double calculateDiscountPrice (Client client, double price){
        if (client.isPremium){
            return calculatePremiumDiscount(price);
        }else
            return calculateStandartDiscount(price);
    }



    private double calculateStandartDiscount (double price){
        if (price > 1000)
            return applyDiscount(price, 0.10);
        else
            return price;
    }


    private double calculatePremiumDiscount (double price){
        if (price > 1000){
            return applyDiscount(price, 0.15);
        }else
            return applyDiscount(price, 0.95);
    }


    private double applyDiscount (double price, double discount){
        return price * (1 - discount);
    }
}
