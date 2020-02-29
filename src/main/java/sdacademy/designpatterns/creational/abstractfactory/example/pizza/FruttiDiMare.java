package sdacademy.designpatterns.creational.abstractfactory.example.pizza;

import sdacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class FruttiDiMare extends Pizza {

    private final int size;

    public FruttiDiMare(int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return "FruttiDiMare";
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getIngredients() {
        return "Fruits???";
    }
}
