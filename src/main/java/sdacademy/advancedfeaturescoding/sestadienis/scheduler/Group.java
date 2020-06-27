package sdacademy.advancedfeaturescoding.sestadienis.scheduler;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private Trainer trainer;
    private List<Student> studentList;

    public Group(String name, Trainer trainer, List<Student> studentList) {
        this.name = name;
        this.trainer = trainer;
        this.studentList = new ArrayList<>();
    }
}
