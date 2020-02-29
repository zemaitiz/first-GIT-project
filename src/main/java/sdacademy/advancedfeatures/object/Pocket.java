package sdacademy.advancedfeatures.object;

public class Pocket {
    private double money;

    public double getMoney() {
        if (money <= 10) {
            money = 0;
        }
        return money;
    }

    public void setMoney(double money) {
        if (money < 0 || money > 3000) {
            System.out.println("The amount of money is too little or too big for my pocket!");
        } else {
            this.money = money;
        }
    }
}
