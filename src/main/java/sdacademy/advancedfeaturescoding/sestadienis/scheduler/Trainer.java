package sdacademy.advancedfeaturescoding.sestadienis.scheduler;

import java.time.LocalDate;
import java.util.Date;

public class Trainer extends Person {

    private boolean isAuthorized;
    public Trainer(String name, String lastName, Date dateOfBirth, boolean isAuthorized) {
        super(name, lastName, dateOfBirth);
        this.isAuthorized = isAuthorized;
    }
}
