package sdacademy.designpatterns.behavioral.strategy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pizza {

    private ArrayList<Ingredient> ingredients;
    private int amount;

    public Pizza() {
        this.amount = 20;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public int calculateTotal() {
        return ingredients.stream()
                .map(Ingredient::getPrice)
                .reduce(0, (result, element) -> result + element);
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(amount + calculateTotal());
    }
}
