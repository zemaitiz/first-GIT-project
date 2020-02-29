package sdacademy.SandBox.skaitliukai;

public abstract class Meter {

    private final Label label;
    private double value;
    private double price;
    private double cost;

    public Meter(Label label, double value) {
        this.value = value;
        this.label = label;
    }

    public enum Label {
        VIRTUVE_KARSTAS("Karštas vanduo (virtuvė)"),
        VIRTUVE_SALTAS("Šaltas vanduo (virtuvė)"),
        TUALETAS_KARSTAS("Karštas vanduo (tualetas)"),
        TUALETAS_SALTAS("Šaltas vanduo (tualetas)"),
        ENERGIJA_DIENINIS("Energija (dieninis)"),
        ENERGIJA_NAKTINIS("Energija (naktinis)");

        private String description;
        ;

        private Label(String description) {
            this.description = description;
        }
    }


    public double getValue() {
        return value;
    }

    public String getLabel() {
        return label.description;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public abstract double getCost();

    public abstract double compareWithLast();

    public abstract double compareWithAvg();

}
