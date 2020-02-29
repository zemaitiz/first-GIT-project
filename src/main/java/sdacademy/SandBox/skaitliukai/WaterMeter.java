package sdacademy.SandBox.skaitliukai;

public class WaterMeter extends Meter {

    private Label label;
    public WaterMeter(Label label, double value) {
        super(label, value);
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public double compareWithLast() {
        return 0;
    }

    @Override
    public double compareWithAvg() {
        return 0;
    }
}
