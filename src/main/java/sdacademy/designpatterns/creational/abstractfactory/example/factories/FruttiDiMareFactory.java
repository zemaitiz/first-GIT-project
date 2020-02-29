package sdacademy.designpatterns.creational.abstractfactory.example.factories;

import sdacademy.designpatterns.creational.abstractfactory.example.pizza.FruttiDiMare;
import sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class FruttiDiMareFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create(int size) {
        return new FruttiDiMare(size);
    }
}
