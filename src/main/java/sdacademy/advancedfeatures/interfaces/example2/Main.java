package sdacademy.advancedfeatures.interfaces.example2;

public class Main {

    public static void main(String[] args) {
        Baloon baloon = new Baloon(56);
        Plane plane = new Plane(880);

        System.out.println(baloon.getSpeed());
        System.out.println(baloon.maxSpeed());

        System.out.println(plane.maxSpeed());
        System.out.println(plane.canFly("fast"));
    }
}
