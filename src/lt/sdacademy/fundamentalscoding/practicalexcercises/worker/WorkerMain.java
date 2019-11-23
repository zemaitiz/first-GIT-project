/*
package lt.sdacademy.fundamentalscoding.practicalexcercises.worker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class WorkerMain {
    public static void main(String[] args) {
        List<Worker> workerList = readDataFromFile();
        //Bandom inicializuot workers objekta
        Worker workers = new Worker();

        System.out.println("Vidutinis darbuotoju uzmokestis: " + averageSalary(workers));
    }

    private static List<Worker> readDataFromFile() {
        List<Worker> workerList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/jonas/IdeaProjects/Introduction webinar/src/lt/sdacademy/fundamentalscoding/practicalexcercises/bookAndAuthor/BooksData.txt"))) {
            String line = br.readLine();

            while (line != null) {
                workerList.add(mapWorkerData(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant faila");
        }
        return workerList;

    }

    private static Worker mapWorkerData(String line) {
        String[] splittedLineData = line.split(",");
        return new Worker(splittedLineData[0], Double.parseDouble(splittedLineData[1]), Integer.parseInt(splittedLineData[2]), splittedLineData[3]);
    }

    private static double averageSalary(List<Worker> workers) {
        double sumOfSalaries = 0;
        for (Worker w : workers) {
            sumOfSalaries += w.getSalary();
        }
        return sumOfSalaries / workers.size();
    }
    private static double averageAge (List<Worker> workers) {
        double sumOfAges = 0;
        for (Worker w : workers) {
            sumOfAges += w.getAge();
        }
        return sumOfAges/workers.size();
    }
  */
/* private static youngestAge (List<Worker> workers) {

    }*//*


}
*/
