package sdacademy.fundamentals.loop.foreach;

public class Example1 {
    public static void main(String[] args) {

        Animal dog = new Animal("Boss","Saint Bernard");
        Animal cat = new Animal ( "Lucy", "Siamese");

        Animal[] animals = {dog, cat};

        for (Animal a: animals) {
            System.out.println(a);
        }

    }
}

class Animal {
    //Kintamieji
    private String name;
    private String breed;

    //Konstruktorius
    Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    //Kintamojo getteris
    public String getName() {
        return name;
    }
}
