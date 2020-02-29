package sdacademy.advancedfeaturescoding.letthewarbegin.third;

public class Person {

    String name;
    int age;
    int phone;

    public Person(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(int phone) {
            this.phone = phone;
    }

    public String toString() {
        return name + ", " + age + "m., tel. nr: " + phone;
    }
}
