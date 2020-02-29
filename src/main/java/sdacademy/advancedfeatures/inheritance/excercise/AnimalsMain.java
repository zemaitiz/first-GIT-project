package sdacademy.advancedfeatures.inheritance.excercise;

import java.util.Arrays;
import java.util.List;

public class AnimalsMain {
public static void main(String[] args) {
    Animal animal = new Animal(true, "blablabla");
    List<Animal> animals = Arrays.asList(
            new Cat (true, "Meow", "Ginger"),
            new Dog(true, "roof", "brown", "collie"),
            new Cat(true, "meow", "black"),
            new Dog(true, "roof", "golden", "rotweiller")
    );

    for (Animal a : animals) {
        System.out.println("I am a " + a.getClass().getSimpleName() + " and " + a.yieldVoice());
    }
}
}
