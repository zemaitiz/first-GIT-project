package sdacademy.designpatterns.structural.decorator.example;

public class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void printIngredients() {
        this.pizza.printIngredients();
    }
    @Override
    public void addIngredients(String ingredients) {
this.pizza.addIngredients(ingredients);
    }
}
