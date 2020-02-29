package sdacademy.advancedfeatures.json.exercise;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonsMain {

    private static Logger logger = Logger.getLogger(PersonsMain.class);

    private static final String INPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/main/sdacademy/advancedfeatures/json/exercise/utils/file.json";

    public static void main(String[] args) {

        Gson gson = new Gson();

        Persons persons;

            try (Reader reader = new FileReader(INPUT_FILE_LOCATION)) {
                 /*Type personsListType = new TypeToken<ArrayList<Person>>(){}.getType();
                 persons = gson.fromJson(reader, personsListType);*/
                 persons = gson.fromJson(reader, Persons.class);

                 persons.getPersons()
                         .forEach(person -> System.out.println(person.getName() + ", " + person.getSurname() + ", " + Arrays.toString(person.getPhone()) + "."));

                logger.info("Data was read successfully.");

            } catch (IOException e) {
                logger.error("Error reading from file!");
            }


        }
    }

