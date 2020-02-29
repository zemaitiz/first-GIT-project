package sdacademy.advancedfeatures.excercises.deliveries;

public abstract class Location {

   protected String name;
    protected String adress;

    public Location(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
}
