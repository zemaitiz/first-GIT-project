package sdacademy.advancedfeaturescoding.warmup.first;

import com.google.gson.Gson;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class First {

    private static final String OUTPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/main/java/sdacademy/advancedfeaturescoding/warmup/first.txt";
    private static final Logger logger = Logger.getLogger(First.class);
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Tomazas", "Maxima", "SDACADEMY", "Adomas", "Afrik", "ana", "ababa");

List<String> updatedList = list.stream()
        .map(String ::toLowerCase)
        .filter(s -> s.startsWith("a"))
        .filter(s -> s.length() == 5)
        .collect(Collectors.toList());

        Gson gson = new Gson();


        try (FileWriter writer = new FileWriter(OUTPUT_FILE_LOCATION)) {
            gson.toJson(updatedList, writer);
            logger.info("Information was successfully written to file.");
        } catch (IOException e) {
            logger.error("File not found!");
        }
    }
}

