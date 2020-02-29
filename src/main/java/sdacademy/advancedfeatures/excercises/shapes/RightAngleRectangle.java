package sdacademy.advancedfeatures.excercises.shapes;

public abstract class RightAngleRectangle extends Shape {

    protected double width;
    protected double height;

    public RightAngleRectangle(String shapeDescription, double width, double height) {
        super(shapeDescription);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
