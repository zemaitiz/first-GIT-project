package sdacademy.designpatterns.creational.abstractfactory.example.factories;

import sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public interface PizzaAbstractFactory {

    Pizza create(int size);

}
