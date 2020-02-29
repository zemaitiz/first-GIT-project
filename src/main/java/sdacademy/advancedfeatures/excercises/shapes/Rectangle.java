package sdacademy.advancedfeatures.excercises.shapes;

public class Rectangle extends RightAngleRectangle {

    public Rectangle(String shapeDescription, double width, double height) {
        super(shapeDescription, width, height);
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

    public static double getRectangleArea(double width, double height) {
        return (width * height);
    }

    public static double getTriangleArea(double width, double height) {
        return ((width * height) / 2);
    }
}
