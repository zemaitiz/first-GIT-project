package sdacademy.advancedfeaturescoding.letthewarbegin.second;

import java.util.Scanner;

public class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Item: " + name + ", price: " + price;
    }

    public void updateItem() {
        System.out.println("Enter new name:");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();
        setName(newName);
        System.out.println("Enter new price:");
        double newPrice =scanner.nextDouble();
        setPrice(newPrice);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
