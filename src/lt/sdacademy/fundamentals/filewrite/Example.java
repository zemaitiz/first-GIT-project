package lt.sdacademy.fundamentals.filewrite;

import java.io.*;

public class Example {
    private static final String OUTPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/lt/sdacademy/fundamentals/filewrite/result.txt";

    public static void main(String[] args) {
        String text = "Good morning";
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
