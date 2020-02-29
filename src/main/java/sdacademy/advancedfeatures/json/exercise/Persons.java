package sdacademy.advancedfeatures.json.exercise;

import java.util.List;

public class Persons {

    private List<Person> persons;

    public Persons(List<Person> persons) {
        this.persons = persons;
    }

    public void printEachPerson(List<Persons> persons) {
        persons.forEach(p -> System.out.println(p));
    }

    public List<Person> getPersons() {
        return persons;
    }
}

