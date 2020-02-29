package sdacademy.designpatterns.creational.abstractfactory.example;

import sdacademy.designpatterns.creational.abstractfactory.example.factories.PizzaFactory;
import sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;



public class AbstractFactory {

    public static void main(String[] args) {

        Pizza margharita = PizzaFactory.createPizza("Margharita", 32);
        Pizza capriciosa = PizzaFactory.createPizza("Capriciosa", 42);
        Pizza fruttidimare = PizzaFactory.createPizza("FruttiDiMare", 42);

        System.out.println(margharita.getName());
        System.out.println(fruttidimare.getIngredients());


    }
}
