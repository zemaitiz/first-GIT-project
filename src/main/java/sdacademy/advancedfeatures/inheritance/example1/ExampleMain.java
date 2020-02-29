package sdacademy.advancedfeatures.inheritance.example1;

public class ExampleMain {

    public static void main(String[] args) {
       Car myCar = new Car(250, true);
       Vehicle myCarVehicle = new Car(130, false);

       Vehicle vehicle = new Vehicle(120);
       System.out.println(vehicle.toString());
    }
}
