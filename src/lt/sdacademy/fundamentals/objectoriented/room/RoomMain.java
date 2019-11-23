package lt.sdacademy.fundamentals.objectoriented.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner Scannner = new Scanner(System.in);

        System.out.println("Iveskite kambario ploti (m):");
        int inputWidth = Scannner.nextInt();
        System.out.println("Iveskite kambario ilgi (m):");
        int inputLength = Scannner.nextInt();

        Room room = new Room (inputWidth,inputLength);

        //int squareOfRoom = inputLength * inputWidth; //cia primityvus budas
        int squareOfRoom = getSquareOfRoom(room.getLentgth(),room.getWidth()); // cia panaudojam Room objekta
        //System.out.println("Grindu plotas: " + squareOfRoom + " m^2");
        System.out.println("Grindu plotas: " + squareOfRoom + " m^2");
    }

    private static int getSquareOfRoom(int length, int width) {
        return (length * width);
    }
}
