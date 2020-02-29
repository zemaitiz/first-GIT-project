package sdacademy.advancedfeaturescoding.letthewarbegin.third;

import com.google.gson.Gson;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThirdMain {

    private static final String INPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/main/java/sdacademy/advancedfeaturescoding/letthewarbegin/third/utils/persons.txt";
    private static final Logger logger = Logger.getLogger(ThirdMain.class);

    public static void main(String[] args) {

        Gson gson = new Gson();
        makePersonListFromFile();
        printList(makePersonListFromFile());





    }





    private static List<Person> makePersonListFromFile() {
        List<Person> personList = new ArrayList<>();

       try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {

           String line = br.readLine();

           while(line != null) {
               personList.add(instantiatePersonFromFile(line));
               line = br.readLine();
           }
           logger.info("Duomenys sekmingai nuskaityti nuo failo ;D");
       } catch (IOException e) {
           logger.error("Klaida nuskaitant nuo failo!!!!!!!!!!");
       }
       return personList;
    }

    private static Person instantiatePersonFromFile(String line) {
        String[] splittedLine = line.split(",");
        return new Person(
                splittedLine[0],
                Integer.parseInt(splittedLine[1]),
                Integer.parseInt(splittedLine[2])
        );
    }

    private static void printList(List<Person> personList) {
        personList.forEach( p -> System.out.println(p.toString()));
    }
}
