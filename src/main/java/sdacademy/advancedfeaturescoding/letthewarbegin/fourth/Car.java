package sdacademy.advancedfeaturescoding.letthewarbegin.fourth;


import java.time.LocalDate;

public class Car extends Vehicle {

    private String fuelType;

    public Car(double price, LocalDate timeOfPurchase, String fuelType) {
        super(price, timeOfPurchase);
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "bike " + price + ", purchased on" + timeOfPurchase + ", fuel type: " + fuelType;

    }
}
