package sdacademy.designpatterns.creational.abstractfactory.example.factories;

/*import main.sdacademy.designpatterns.creational.abstractfactory.example.pizza.Capriciosa;
import main.sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;*/

import sdacademy.designpatterns.creational.abstractfactory.example.pizza.Capriciosa;
import sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class CapriciosaFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create(int size) {
        return new Capriciosa(size);
    }
}
