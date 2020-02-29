package sdacademy.fundamentalstesting.tdd;

public class Euro {

    private double amount;

    public Euro(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("EUR %.2f", amount);
    }

    public boolean equal(Object o) {
        return o instanceof Euro && amount == ((Euro) o).amount;
    }

    public int subtract(int numToBeSubtracted) {
        return (int)amount - numToBeSubtracted;
    }

    public double divide(Euro euras) {
return amount / euras.amount;
    }

    public double multiply(double num) {
        Euro euras = new Euro(2);
return amount *  euras.amount;
    }
}
