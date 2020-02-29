package sdacademy.designpatterns.creational.builder.example;

public class Pizza {

    private final String name;
    private final int size;

    private final boolean isAddCheese;
    private final boolean isAddSauce;
    private final boolean isTakeAway;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isAddCheese() {
        return isAddCheese;
    }

    public boolean isAddSauce() {
        return isAddSauce;
    }

    public boolean isTakeAway() {
        return isTakeAway;
    }

    @Override
    public String toString() {
        return "Pizza= " + this.getName() + ", Size= " + getSize()
                + (this.isAddCheese ? ", add cheese" : "")
                + (this.isAddSauce ? ", add sauce" : "")
                + (this.isTakeAway ? ", is takeaway" : "");
    }

    private Pizza(PizzaBuilder builder) {
        this.name = builder.name;
        this.size = builder.size;
        this.isAddCheese = builder.isAddCheese;
        this.isAddSauce = builder.isAddSauce;
        this.isTakeAway = builder.isTakeAway;
    }

    public static class PizzaBuilder {

        private String name;
        private int size;

        private boolean isAddCheese;
        private boolean isAddSauce;
        private boolean isTakeAway;

        public PizzaBuilder(String name, int size) {
            this.name = name;
            this.size = size;
        }

        public PizzaBuilder addCheese(boolean isAddCheese) {
            this.isAddCheese = isAddCheese;
            return this;
        }

        public PizzaBuilder addSauce(boolean isAddSauce) {
            this.isAddSauce = isAddSauce;
            return this;
        }

        public PizzaBuilder takeAway(boolean isTakeAway) {
            this.isTakeAway = isTakeAway;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
