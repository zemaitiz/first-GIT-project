package sdacademy.advancedfeatures.excercises.shapes;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ShapesMain {

    private  static final String OUTPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/lt/sdacademy/advancedfeatures/excercises/shapes/result.txt";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = null;



        System.out.println("Enter the type of shape: ");
        String shapeDescription = input.nextLine();
        if (shapeDescription.equalsIgnoreCase("circle")) {
            System.out.println("Enter the radius: ");
            double radius = input.nextDouble();
            Circle circle = new Circle(shapeDescription, radius);
            text = "Your circle's area is: " + Circle.getCircleArea(circle.getRadius()) + " . Your circle's length is: " + Circle.getCircleLength(circle.getRadius()) + ".";
            System.out.println("Your circle's area is: " + Circle.getCircleArea(circle.getRadius()) + " . Your circle's length is: " + Circle.getCircleLength(circle.getRadius()) + ".");
        } else if (shapeDescription.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter the width:");
            double width = input.nextDouble();
            System.out.println("Enter the height:");
            double heigth = input.nextDouble();
            Rectangle rectangle = new Rectangle(shapeDescription, width, heigth);
            text = "Your rectangle's area is " + Rectangle.getRectangleArea(rectangle.getWidth(), rectangle.getHeight()) + "." + "\n" + "Your triangles's area is: " + Rectangle.getTriangleArea(rectangle.getWidth(), rectangle.getHeight()) + ".";
            System.out.println("Your rectangle's area is " + Rectangle.getRectangleArea(rectangle.getWidth(), rectangle.getHeight()) + ".");
            System.out.println("Your triangles's area is: " + Rectangle.getTriangleArea(rectangle.getWidth(), rectangle.getHeight()) + ".");
        }
        writeDataToFile(text);
    }

    private static void writeDataToFile(String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write(data);
        }
        //sitas butent nurodo, jog failas nerastas, negalima sukeist siu catchu vietomis - tvarka svarbi, nes IOException suvalgo viska
        catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        }
        //jei naudosim tik sita, tai bus neaisku, del ko klaida
        catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila!");
        }
    }
}

