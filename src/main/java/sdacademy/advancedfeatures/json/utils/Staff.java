package sdacademy.advancedfeatures.json.utils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Staff {

    private String name;
    private int age;
    private String[] position;
    private List<String> skills;
    private Map<String, BigDecimal> salary;

    public Staff(String name, int age, String[] position, List<String> skills, Map<String, BigDecimal> salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.skills = skills;
        this.salary = salary;
    }

    public static Staff buildStaff() {
        return new Staff(
                "George",
                30,
                new String[]{"CTO", "Founder", "Director"},
                Arrays.asList("Java", "Kotlin", "Python", "Js"),
                new HashMap<>(

                ));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}

