package sdacademy.advancedfeaturescoding.letthewarbegin.fourth;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private List<Vehicle> vehicleList;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.vehicleList = new ArrayList<>();
    }

    public String toString() {
        return name + ", " + age + " years old ";
    }
    public void buyVehicle() {
        System.out.println("Buying a vehicle: bike or car? b:c");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        switch (answer) {
            case "b" :
                vehicleList.add(new Bike(199.99, LocalDate.now()));
                break;
            case  "c" :
                vehicleList.add(new Car(2999.99, LocalDate.now(), "diesel"));
                break;
            default :
                System.out.println("Try again!");
        }
    }

    public void printVehicles() {
        vehicleList.forEach(vehicle -> System.out.println(vehicle.toString()));
    }
}
