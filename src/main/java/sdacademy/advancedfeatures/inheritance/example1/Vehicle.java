package sdacademy.advancedfeatures.inheritance.example1;

public class Vehicle {
    private int maxSpeed;

    public Vehicle (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Fields value: maxSpeed= " + maxSpeed;
    }
}
