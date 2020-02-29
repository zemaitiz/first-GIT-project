package sdacademy.designpatterns.creational.builder.example;

public class Builder {

    public static void main(String[] args) {

        Pizza margharita = new Pizza.PizzaBuilder("Margharita", 50)
                .addCheese(true)
                .addSauce(true)
                .takeAway(false)
                .build();

        Pizza capriciosa = new Pizza.PizzaBuilder("Capriciosa", 42)
                .addCheese(false)
                .addSauce(true)
                .takeAway(true)
                .build();

        System.out.println(margharita.toString() + "\n" + capriciosa.toString());
    }
}
