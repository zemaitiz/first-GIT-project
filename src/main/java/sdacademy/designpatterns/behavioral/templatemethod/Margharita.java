package sdacademy.designpatterns.behavioral.templatemethod;

public class Margharita extends Pizza {


    @Override
    protected void addIngredients() {
        System.out.println("Margharita");
        System.out.println("Add ingrdients: tomato sauce, cheese");
    }
}
