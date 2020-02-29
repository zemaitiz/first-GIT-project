package sdacademy.designpatterns.creational.singleton;

//import main.sdacademy.designpatterns.creational.singleton.example.Pizza;

import sdacademy.designpatterns.creational.singleton.example.Pizza;

public class Singleton {

    public static void main(String[] args) {
        Pizza margharita = Pizza.getInstance();
        margharita.name = "Margharita";

        Pizza capriciosa = Pizza.getInstance();
        capriciosa.name = "Capriciosa";

        Pizza fruttidimare = Pizza.getInstance();
        fruttidimare.name = "Frutti di Mare";

        System.out.println(margharita);
        System.out.println(capriciosa);
        System.out.println(fruttidimare);

    }
}
