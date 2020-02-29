package sdacademy.designpatterns.creational.factorymethods;


import sdacademy.designpatterns.creational.factorymethods.example.Pizza;
import sdacademy.designpatterns.creational.factorymethods.example.PizzaFactory;

public class FactoryMethod {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza margharita = factory.getPizza(1);
        Pizza capriciosa = factory.getPizza(2);
        Pizza fruttidimare = factory.getPizza(3);


        System.out.println(margharita.getDetectedPizza());
        System.out.println(capriciosa.getDetectedPizza());
        System.out.println(fruttidimare.getDetectedPizza());

    }
}
