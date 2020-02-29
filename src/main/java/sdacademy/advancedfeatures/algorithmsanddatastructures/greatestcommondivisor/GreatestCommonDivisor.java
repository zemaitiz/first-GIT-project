package sdacademy.advancedfeatures.algorithmsanddatastructures.greatestcommondivisor;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 24;
        int b = 18;
        while (a != b) {
            if (a < b) {
                b = b - a;
            }
            else {
                a = a - b;
            }
        }
            System.out.println(a);
    }
}
