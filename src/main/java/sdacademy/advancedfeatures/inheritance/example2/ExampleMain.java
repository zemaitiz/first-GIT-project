package sdacademy.advancedfeatures.inheritance.example2;

public class ExampleMain {

    public static void main(String[] args) {
       Car myCar = new Car(250);
       Vehicle myCarVehicle = new Car(130);

       Vehicle vehicle = new Vehicle(120);
       System.out.println(vehicle.toString());
    }
}
