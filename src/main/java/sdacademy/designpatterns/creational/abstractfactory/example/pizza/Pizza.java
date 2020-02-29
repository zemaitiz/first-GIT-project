package sdacademy.designpatterns.creational.abstractfactory.example.pizza;

public abstract class Pizza {

    public abstract String getName();

    public abstract int getSize();

    public abstract String getIngredients();

    @Override
    public String toString() {
        return "Pizza= " + this.getName() + ", size= " + this.getSize() + ", ingredients= " + this.getIngredients();
    }
}
