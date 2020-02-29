package sdacademy.designpatterns.structural.decorator.example;

public class SeafoodPizza extends PizzaDecorator{
    public SeafoodPizza(Pizza pizza) {
        super(pizza);
        super.addIngredients("SeaFood");
    }

    @Override
    public void printIngredients() {super.printIngredients();}
}
