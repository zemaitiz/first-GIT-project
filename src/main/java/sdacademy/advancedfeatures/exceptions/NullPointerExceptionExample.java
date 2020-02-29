package sdacademy.advancedfeatures.exceptions;

public class NullPointerExceptionExample {

    public static void main(String[] args) throws IvykoAritmetineKlaida {
        try {
            String a = null; // null value
            System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            throw new IvykoAritmetineKlaida("Isspausdinamas custom exception");
        }
    }
}
