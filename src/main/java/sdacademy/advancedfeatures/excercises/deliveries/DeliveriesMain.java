/*
package main.sdacademy.advancedfeatures.excercises.deliveries;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeliveriesMain {

    private static final String OUTPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/main/sdacademy/advancedfeatures/excercises/deliveries/result.txt";
private static final String INPUT_FILE_LOCATION = "/home/jonas/IdeaProjects/Introduction webinar/src/main/sdacademy/advancedfeatures/excercises/deliveries/data.txt";
    public static void main(String[] args) {


        //writeDataToFile();


        private static List<Company> readDataFromFile() {
            List<Company> companyList = new ArrayList<>();
                try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {
                    String line = br.readLine();
                    while (true) {
                        line = br.readLine();
                        if (line == null) {
                            break;
                        }
                        companyList.add(mapDataToObject(line.split(",")));
                    }
                } catch (IOException e) {
                    System.out.println("KLAIDA!");
                }
                return  carList;
            };
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
}
*/
