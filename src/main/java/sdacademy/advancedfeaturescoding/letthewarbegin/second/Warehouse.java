package sdacademy.advancedfeaturescoding.letthewarbegin.second;

import sdacademy.advancedfeaturescoding.letthewarbegin.second.Item;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Warehouse {

    Scanner scanner = new Scanner(System.in);

    Map<String, Item> warehouse = new HashMap<>();

    public Warehouse(/*Map<String, Item> warehouse*/) {
        /*this.warehouse = warehouse;*/
    }

    public void addItem() {
        boolean adding = true;
        while (adding) {
            System.out.println("Enter item's name");
            String name = scanner.nextLine();
            System.out.println("Enter item's price");
            double price = scanner.nextDouble();
            Item item = new Item(name, price);
            warehouse.put(item.getName(), item);
            scanner.nextLine();
            System.out.println("Do you want to add another item? y : n");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                adding = false;
            }
        }
    }

    public void displayItems() {
        warehouse.forEach((k, v) -> System.out.println(v.toString()));
    }

    public void deleteItem() {
        System.out.println("What item do you want to remove from warehouse?");
        String itemToRemove = scanner.nextLine();
     warehouse.remove(itemToRemove);
    }

    public void addItemsInBulk() {
        System.out.println("Enter item's name:");
        String name = scanner.nextLine();
        System.out.println("Enter item's price");
        double price = scanner.nextDouble();
        System.out.println("Enter amount of this item you want to add:");
        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            Item item = new Item(name, price);
            warehouse.put(item.getName(), item);
        }
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (Item v : warehouse.values()) {
            totalPrice += v.getPrice();
        }
        return totalPrice;
    }
}
