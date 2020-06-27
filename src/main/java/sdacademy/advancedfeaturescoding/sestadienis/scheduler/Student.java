package sdacademy.advancedfeaturescoding.sestadienis.scheduler;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person{

    private boolean hasPreviousJavaKnowledge;

    public Student(String name, String lastName, Date dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(name, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return getName() + "\n" + getLastName() + "\n" + getDateOfBirth() + "\n" + hasPreviousJavaKnowledge;
    }
}
