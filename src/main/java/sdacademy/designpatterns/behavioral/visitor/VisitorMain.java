/*
package main.sdacademy.designpatterns.behavioral.visitor;

import lt.sdacademy.designpatterns.behavioral.visitor.example.Car;
import lt.sdacademy.designpatterns.behavioral.visitor.example.Computer;
import lt.sdacademy.designpatterns.behavioral.visitor.example.Item;
import lt.sdacademy.designpatterns.behavioral.visitor.example.Visitor;
import lt.sdacademy.designpatterns.behavioral.visitor.example.VisitorImpl;
import lt.sdacademy.designpatterns.behavioral.visitor.exercise.Animal;

import java.util.ArrayList;

public class VisitorMain {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Car("Ford Mondeo", "black", 14000));
        items.add(new Car("Opel Corsa", "white", 19000));
        items.add(new Computer("8 GB", "1 TB", "3,8 GHz 2 core", 2000));
        items.add(new Computer("16 GB", "1 TB SSD", "4,5 GHz 8 core", 5000));

        int total = 0;
        Visitor visitor = new VisitorImpl();

        for (Item item : items) {
            total += new Car("Ford Mondeo", "black", 14000)
                    .accept(visitor);
        }
        System.out.println("Total Cost = " + total);



















        items = new ArrayList<>();
        items.add(new Animal("Dog", 140));
        items.add(new Animal("Cat", 58));
        visitor = new VisitorImpl();
        total = 0;
        for (Item item : items) {
            total += item.accept(visitor);
        }
        System.out.println("Total Cost = " + total);
    }

}*/
