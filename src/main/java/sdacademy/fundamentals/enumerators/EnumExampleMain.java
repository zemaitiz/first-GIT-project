package sdacademy.fundamentals.enumerators;

public class EnumExampleMain {
    //enum - kai kuriam enumeratoriu
    public static void main(String[] args) {
        System.out.println(EnumClassExample1.BMW.name());
        System.out.println(EnumClassExample2.BMW.getCarName());

        EnumClassExample3 car = EnumClassExample3.getEnumByCarName("volkswagen");
        System.out.println(car.isRunAndDrive());
    }
}
