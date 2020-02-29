package sdacademy.advancedfeaturescoding.letthewarbegin.fourth;


import java.time.LocalDate;

public abstract class Vehicle {

    protected double price;
    protected LocalDate timeOfPurchase;

    public Vehicle(double price, LocalDate timeOfPurchase) {
        this.price = price;
        this.timeOfPurchase = timeOfPurchase;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", timeOfPurchase=" + timeOfPurchase +
                '}';
    }
}
