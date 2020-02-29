package sdacademy.designpatterns.structural.decorator.example;

public class Decorator {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza.printIngredients();
        /*Pizza hamPizza = new HamPizza(pizza);
        pizza.printIngredients();
        Pizza mushroomPizza = new MushroomPizza(pizza);
        pizza.printIngredients();*/

        Pizza seafoodPizza = new SeafoodPizza(pizza);
        pizza.printIngredients();
        pizza.addIngredients("ananasai");
        pizza.printIngredients();
    }
}
