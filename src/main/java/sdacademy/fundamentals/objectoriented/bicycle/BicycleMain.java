package sdacademy.fundamentals.objectoriented.bicycle;

public class BicycleMain {
    public static void main(String[] args) {

        Bicycle bike = new Bicycle(75, 2, 20);

        bike.getModel();// grazinama 75
        System.out.println(bike.getModel());//isvesta i ekrana 75

        int model = bike.getModel();
        System.out.println("Model is " + model);

        System.out.println(Bicycle.count);//Isvesta i ekrana 1
        Bicycle anotherBike = new Bicycle(80, 4, 25);
        System.out.println(Bicycle.count);//isvesta i ekrana 2

        //abiejuose atvejuose isvedama reiksme yra true
        System.out.println(Bicycle.count == bike.count);
        System.out.println(bike.count == anotherBike.count);

    }
}
