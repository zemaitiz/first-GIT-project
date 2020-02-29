package sdacademy.advancedfeatures.excercises.deliveries;

public class Person extends Location{

    private GadgetType gadgetType;
    private String deliverUntil;

    public Person(String  name, String deliveryAdress, GadgetType gadgetType, String deliverUntil) {
        super(name, deliveryAdress);
        this.gadgetType = gadgetType;
        this.deliverUntil = deliverUntil;
    }

    public String getName() {
        return name;
    }


    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public String getDeliverUntil() {
        return deliverUntil;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGadgetType(GadgetType gadgetType) {
        this.gadgetType = gadgetType;
    }

    public void setDeliverUntil(String deliverUntil) {
        this.deliverUntil = deliverUntil;
    }
}
