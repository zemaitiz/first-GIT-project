package lt.sdacademy.fundamentalscoding.practicalexcercises.homework.dog;

public class Dog {
     String name;
     int age;
    String color;


public Dog (String dogName, int dogAge, String dogColor) {
    this.name = dogName;
    this.age = dogAge;
    this.color = dogColor;
}

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
    return color;
    }
}
