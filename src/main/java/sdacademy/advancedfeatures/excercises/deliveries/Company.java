package sdacademy.advancedfeatures.excercises.deliveries;

public class Company extends Location {
    private Gadget gadget;

    public Company(String name, String companyAdress,Gadget gadget) {
        super(name, companyAdress);
        this.gadget = gadget;
    }


    public Gadget getGadget() {
        return gadget;
    }

    public void setGadget(Gadget gadget) {
        this.gadget = gadget;
    }
}
