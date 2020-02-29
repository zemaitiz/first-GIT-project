package sdacademy.advancedfeatures.excercises.shapes;

public abstract class Shape {

    protected String shapeDescription;

    public Shape (String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }

    public void setShapeDescription(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }
}
