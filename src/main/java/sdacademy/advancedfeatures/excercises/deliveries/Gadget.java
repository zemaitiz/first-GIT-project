package sdacademy.advancedfeatures.excercises.deliveries;

public class Gadget {

    private GadgetType gadgetType;
    private double price;
    private Courier courier;

    public Gadget(GadgetType gadgetType, double price, Courier courier) {
        this.gadgetType = gadgetType;
        this.price = price;
        this.courier = courier;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public double getPrice() {
        return price;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setGadgetType(GadgetType gadgetType) {
        this.gadgetType = gadgetType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }
}

