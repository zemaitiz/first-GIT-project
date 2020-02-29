package sdacademy.advancedfeatures.generics.excercises.excercise1;

public class Main {

    public static void main(String[] args) {
        Generic generic = new Generic();

        generic.storeValue("Labas");
        generic.storeValue(5);
        generic.storeValue(10.20);

        for (Object g : generic.getList() ) {
            System.out.println(g);
        }

        ;
    }
}
