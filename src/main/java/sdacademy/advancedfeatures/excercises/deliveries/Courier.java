package sdacademy.advancedfeatures.excercises.deliveries;

public class Courier extends Location {

    private String deliveryDate;

    public Courier(String name, String deliveredFrom, String deliveryDate) {
        super(name, deliveredFrom);
        this.deliveryDate = deliveryDate;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
