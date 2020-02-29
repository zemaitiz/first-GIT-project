package sdacademy.person;

import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jusu vardas");
        String name = input.nextLine();

        System.out.println("Jusu amzius");
        int age = input.nextInt();

        System.out.println("Jusu ugis");
        double tall = input.nextDouble();

        System.out.println("Ivestas vardas " + name);
        System.out.println("Ivestas amzius " + age);
        System.out.println("Ivestas ugis " + tall);

        Person personA = new Person(name, age, tall);
    }
}
