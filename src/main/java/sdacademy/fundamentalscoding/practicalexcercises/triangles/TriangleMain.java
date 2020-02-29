package sdacademy.fundamentalscoding.practicalexcercises.triangles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TriangleMain {
    //nurodome butinai failo pavadinima gale, nes bus FileNotFound
    private static final String OUTPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/lt/sdacademy/fundamentalscoding/practicalexcercises/triangles/triangleTypeAndPerimeter.txt";

    public static void main(String[] args) {
        List<Triangle> triangles = getTrianglesFromFile();
//cia nenurodom skliaustuose nieko, kadangi neduodam jokio parametro, paima is failo viska
        getTrianglesFromFile();
        //cia nurodom funkcijos parametra
        calcPerimeter(triangles);
        writePerimeterToFile(triangles);


    }

    private static List<Triangle> getTrianglesFromFile() {
        List<Triangle> triangles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/jonas/IdeaProjects/Introduction webinar/src/lt/sdacademy/fundamentalscoding/practicalexcercises/triangles/trianglesData.txt"))) {


            String line = br.readLine();

            while (line != null) {
                triangles.add(mapInfoToModel(line));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila!");
        }

        return triangles;
    }

    private static Triangle mapInfoToModel(String line) {
        String[] splittedLine = line.split(",");
        return new Triangle(
                Integer.parseInt(splittedLine[0]),
                Integer.parseInt(splittedLine[1]),
                Integer.parseInt(splittedLine[2]),
                TriangleType.valueOf(splittedLine[3]));
    }

    //void, del to nenurodom nieko pries f-jos varda
    //paduodamo parametro tipas - List<musu_sarasas)
    // pats parametras musu sukurtas sarasas
    private static void calcPerimeter(List<Triangle> triangles) {
        for (Triangle t : triangles) {
            int sum = t.getA() + t.getB() + t.getC();
            t.setPerimeter(sum);
        }
    }


    private static void writePerimeterToFile(List<Triangle> triangles) {
        //FileWriter paima failo lokacija (atidaro faila?)
        //BufferedWriter irasineja i output faila
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {

            //sukam cikla per visa sarasa (triangles), pradzioj nurodome, kokie objektai yra sarase (Triangle), iteruojam kiekviena objekta (t)
            for (Triangle t:triangles){
                //cikle kvieciame obj. ir naudojam jame esancia f-ja .write, i ja paduodami trikampio tipa ir
                // perimetra(t.getTriangeDescription ir t.getPerimeter), .t reiskia, kad butent to konkretaus trikampio duomenis duoda
                bw.write("Trikampio tipas: " + t.getTriangleType().getTriangleDescription() + ", Trikampio perimetras: " + t.getPerimeter() +";"
 + "\n");

            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas!");
        } catch (IOException e) {
            System.out.println("Klaida irasant faila");
        }
    }
}
