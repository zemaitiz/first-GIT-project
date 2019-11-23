package lt.sdacademy.fundamentalscoding.practicalexcercises.triangles;

public class Triangle {
   private int a;
    private int b;
    private int c;
    private TriangleType triangleType;
    private int perimeter;
    public Triangle(int a, int b, int c, TriangleType triangleType) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.triangleType = triangleType;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }
    public TriangleType getTriangleType() {
        return triangleType;
    }
    public int getPerimeter() {
        return perimeter;
    }
// setteriui reikia nurodyti paduodama duomenu tipa
    public void setPerimeter(int sumOfSideLengths) {
        this.perimeter = perimeter;
    }
}
