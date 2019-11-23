package lt.sdacademy.fundamentalscoding.practicalexcercises.homework.car.refactored;

public class Car {
    private String model;
    int engine;
    String type;
    private int year;
    double price;
    public Car (String model, int engine, int year, double price, String type) {
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.type = type;
    }
    public String getModel() { return model; }
    public int getEngine() { return  engine; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getType() { return type; }
}