package sdacademy.advancedfeatures.interfaces.example1;

public interface Shape {

    double getArea();

    double getPerimeter();

    default void print() {
    System.out.println("Shape: " + this.getClass().getSimpleName());
    }
}
