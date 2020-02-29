package sdacademy.designpatterns.behavioral.templatemethod;

public class TemplateMethod {

    public static void main(String[] args) {
        Pizza margharita = new Margharita();
        Pizza capriciosa = new Capriciosa();
        margharita.bakingPizza();
        System.out.println("------------------------------");
        capriciosa.bakingPizza();
    }
}
