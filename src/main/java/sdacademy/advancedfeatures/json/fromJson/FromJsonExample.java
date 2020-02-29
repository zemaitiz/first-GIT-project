package sdacademy.advancedfeatures.json.fromJson;

import com.google.gson.Gson;
import org.apache.log4j.Logger;
import sdacademy.advancedfeatures.json.utils.Staff;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FromJsonExample {

    private static final Logger logger = Logger.getLogger(FromJsonExample.class);
    private static final String INPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/main/sdacademy/advancedfeatures/json/utils/file1.json";


    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(INPUT_FILE_LOCATION)) {
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);

            logger.info("Data was read successfully");
        } catch (IOException e) {
            logger.error("Error occurred while reading file!");
        }

    }
}
