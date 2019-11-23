package lt.sdacademy.fundamentalscoding.practicalexcercises.circle;

import static java.lang.Math.PI;

public class Circle {
    public double radius;
    public String color;


public Circle (double setRadius, String setColor) {
    this.radius = setRadius;
    this.color = setColor;
}

    public double calculateLength(double radius) {
        return 2 * PI * radius;
    }

    public double calculateArea(double radius) {
        return  PI * Math.pow(radius, 2);
    }

    public String printColor (String color) {

    return color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
