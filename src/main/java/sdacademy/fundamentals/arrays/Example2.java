package sdacademy.fundamentals.arrays;

public class Example2 {
    public static void main (String[] args) {
        String[] arrayOfStrings = new String[2];

        //Inicializavimas
        arrayOfStrings[0] = "Tree";
        arrayOfStrings[1] = "Forest";

        for (String s : arrayOfStrings) {
            System.out.println(s);
        }
    }
}
