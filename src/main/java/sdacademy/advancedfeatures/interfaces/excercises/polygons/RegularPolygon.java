package sdacademy.advancedfeatures.interfaces.excercises.polygons;

public interface RegularPolygon {

     int getNumSides();
    int getSideLength();

    default int getPerimeter() {
        return getNumSides() * getSideLength();
    }

    default int getInteriorAngle() {
        return (getNumSides() - 2) * 180;
    }
}
