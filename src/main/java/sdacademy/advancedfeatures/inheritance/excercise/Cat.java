package sdacademy.advancedfeatures.inheritance.excercise;

public class Cat extends Animal{
    private String color;


    public Cat(boolean mammal, String voice, String color) {
        super(mammal, voice);
        this.color = color;
    }
}
