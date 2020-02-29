package sdacademy.advancedfeaturescoding.letthewarbegin.first;

public class Person {

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        if (age >= 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Kid");
        }
    }
}