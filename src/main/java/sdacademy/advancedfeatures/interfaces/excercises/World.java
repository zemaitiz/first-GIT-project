package sdacademy.advancedfeatures.interfaces.excercises;

import java.math.BigDecimal;

public abstract class World implements Richest{
    protected String name;
    protected BigDecimal amount;

    public World(String name, BigDecimal amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public boolean findRicher(BigDecimal amount) {
        return this.amount.compareTo(amount) < 0;
    }
}
