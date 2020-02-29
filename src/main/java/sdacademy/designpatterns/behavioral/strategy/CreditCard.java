package sdacademy.designpatterns.behavioral.strategy;

public class CreditCard implements PaymentStrategy {

    private String fullName;
    private String cardNumber;
    private String ccv;
    private String dateOfExpiry;

    public CreditCard(String fullName, String cardNumber, String ccv, String dateOfExpiry) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.dateOfExpiry = dateOfExpiry;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Cost: " + amount + "$, paid with credit card");

    }
}
