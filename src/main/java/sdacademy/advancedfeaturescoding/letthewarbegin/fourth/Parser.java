package sdacademy.advancedfeaturescoding.letthewarbegin.fourth;

import sdacademy.fundamentalscoding.practicalexcercises.worker.Worker;


import java.time.LocalDate;
import java.util.Scanner;

public class Parser {

    public Person instantiatePerson(String userDetails) {
String[] mappedUserDetails = userDetails.split(",");
        return new Person(mappedUserDetails[0], (LocalDate.now().getYear() - LocalDate.parse(mappedUserDetails[1]).getYear()));
    }
}
