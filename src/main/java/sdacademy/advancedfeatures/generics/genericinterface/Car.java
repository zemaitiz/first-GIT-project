package sdacademy.advancedfeatures.generics.genericinterface;

public class Car implements java.lang.Comparable<Car> {

    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public int compareTo(Car otherCar) {
        return this.maxSpeed - otherCar.maxSpeed;
    }
}
