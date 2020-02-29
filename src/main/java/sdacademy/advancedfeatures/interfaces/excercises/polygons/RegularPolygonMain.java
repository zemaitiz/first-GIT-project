package sdacademy.advancedfeatures.interfaces.excercises.polygons;

public class RegularPolygonMain {

    public static void main(String[] args) {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        Square square = new Square(15);

        System.out.println(equilateralTriangle.getPerimeter() +  "\n" + equilateralTriangle.getInteriorAngle() );
        System.out.println(square.getPerimeter() +  "\n" + square.getInteriorAngle() );
    }
}
