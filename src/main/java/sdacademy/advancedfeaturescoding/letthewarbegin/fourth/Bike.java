package sdacademy.advancedfeaturescoding.letthewarbegin.fourth;


import java.time.LocalDate;

public class Bike extends Vehicle {
    public Bike(double price, LocalDate timeOfPurchase) {
        super(price, timeOfPurchase);
    }

    @Override
    public String toString() {
        return "bike " + price + ", purchased on" + timeOfPurchase;
    }
}


