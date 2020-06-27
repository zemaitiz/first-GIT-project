/*
package sdacademy.advancedfeaturescoding.sestadienis.scheduler;

import org.kohsuke.randname.RandomNameGenerator;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SchedulerMain {

    public static void main(String[] args) {

       generateStudentList().stream()
               .forEach(student -> System.out.println(student.toString()));


    }

*/
/*
    private static List<Student> createStudentList() {

        List<Student> studentList = new ArrayList<>();

        while (studentList.size() < 3) {
            System.out.println("Enter student's name, last name, date of birth in YYYY-MM-DD." + "\n"
                    + "Separate with a ,");
            Scanner scanner = new Scanner(System.in);
            String[] splittedLineData = scanner.nextLine().split(";");
            System.out.println("If student has previous coding experience, enter 1, otherwise enter 0.");
            boolean experience = scanner.nextBoolean();
            studentList.add(new Student(splittedLineData[0], splittedLineData[1], Date.parse(splittedLineData[2]), experience));
        }
        return studentList;
    }
*//*


    private static List<Student> generateStudentList() {

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    Person person = new Student("Tomas", "Vestartas", simpleDateFormat., true);

        List<Student> studentList;
        return studentList;
    }
}
*/
