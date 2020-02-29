package sdacademy.advancedfeatures.excercises.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getCircleArea(double radius) {
        return( Math.PI * Math.pow(radius, 2));

}

    public static double getCircleLength(double radius) {
        return( 2 * Math.PI * radius);
    }


}
