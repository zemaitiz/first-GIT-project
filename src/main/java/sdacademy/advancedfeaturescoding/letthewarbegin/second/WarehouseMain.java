package sdacademy.advancedfeaturescoding.letthewarbegin.second;

public class WarehouseMain {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addItem();
        //warehouse.addItemsInBulk();

        warehouse.displayItems();
        System.out.println(warehouse.totalPrice());
        warehouse.deleteItem();
        warehouse.displayItems();

    }
}
