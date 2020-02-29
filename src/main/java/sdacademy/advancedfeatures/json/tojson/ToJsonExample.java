package sdacademy.advancedfeatures.json.tojson;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import sdacademy.advancedfeatures.json.utils.Staff;

import java.io.FileWriter;
import java.io.IOException;

public class ToJsonExample {

    private static final Logger logger = Logger.getLogger(ToJsonExample.class);
    private static final String OUTPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/main/sdacademy/advancedfeatures/json/utils/file1.json";

    public static void main(String[] args) {

        Gson gson = new Gson();

        Staff staff = Staff.buildStaff();

        String staffInJson = gson.toJson((staff));
        logger.info(staffInJson);

        try (FileWriter writer = new FileWriter(OUTPUT_FILE_LOCATION)) {
            gson.toJson(staffInJson, writer);
            logger.info("Information was successfully written to file.");
        } catch (IOException e) {
            logger.error("File not found!");
        }
    }
}
