package sdacademy.advancedfeatures.inheritance.excercise;

public class Dog extends Animal {
    private String color;
    private String breed;

    public Dog(boolean mammal, String voice, String color, String breed) {
        super(mammal,voice);
        this.color = color;
        this.breed = breed;
    }
}
