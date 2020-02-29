package sdacademy.advancedfeatures.exceptions;

public class IvykoAritmetineKlaida extends Exception {

    private String message;

    public IvykoAritmetineKlaida(String message) {
        this.message = message;
    }
}
