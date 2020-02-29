package sdacademy.designpatterns.behavioral.strategy;

public class Strategy {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        Ingredient ingredient1 = new Ingredient("Cheese", 15);
        Ingredient ingredient2 = new Ingredient("Ham", 20);
        Ingredient ingredient3 = new Ingredient("Mushrooms", 10);

        pizza.addIngredient(ingredient1);
        pizza.addIngredient(ingredient2);
        pizza.addIngredient(ingredient3);

        pizza.pay(new Cash());

        pizza.pay(new CreditCard("Tomas Vestartas", "852852552", "123", "02/02/2020"));
    }
}
