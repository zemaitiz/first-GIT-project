package sdacademy.advancedfeatures.object;

public class PocketMain {
    public static void main(String[] args) {
        Pocket pocket = new Pocket();
        pocket.setMoney(9000);
        double amount = pocket.getMoney();
        System.out.println("There is " + amount + " of money in your pocket.");
    }
}
