package sdacademy.advancedfeatures.concurrency.excercise1;

public class Excercise1Main {

    public static void main(String[] args) {
        Object object1 = new Object(50);
        new Thread(object1).start();

        Object object2= new Object(40);
        new Thread(object2).start();

        Object object3 = new Object(30);
        new Thread(object3).start();

        Object object4= new Object(20);
        new Thread(object4).start();

        object1.stopThread();
        object2.stopThread();
        object3.stopThread();
        object4.stopThread();





    }
}
