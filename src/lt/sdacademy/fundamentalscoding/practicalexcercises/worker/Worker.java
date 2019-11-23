package lt.sdacademy.fundamentalscoding.practicalexcercises.worker;

public class Worker {
    private String name;
    private double salary;
    private int age;
    private String gender;

    public Worker (String name, double salary, int age, String gender) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public  double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
}
