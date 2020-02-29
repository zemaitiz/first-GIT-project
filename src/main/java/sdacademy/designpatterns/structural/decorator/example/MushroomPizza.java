package sdacademy.designpatterns.structural.decorator.example;

public class MushroomPizza extends PizzaDecorator{

    public MushroomPizza(Pizza pizza) {
        super(pizza);
        super.addIngredients("Mushrooms");
    }

    @Override
    public void printIngredients() {
        super.printIngredients();
    }
}
