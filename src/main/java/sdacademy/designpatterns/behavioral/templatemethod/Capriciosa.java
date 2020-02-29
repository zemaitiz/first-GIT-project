package sdacademy.designpatterns.behavioral.templatemethod;

public class Capriciosa extends Pizza {


    @Override
    protected void addIngredients() {
        System.out.println("Margharita");
        System.out.println("Add ingrdients: tomato sauce, cheese, ham, mushrooms");
    }
}
