package DTOs;

import java.util.ArrayList;
import java.util.List;

public class PersonsDTO {
    private List<Person> personList;

    public PersonsDTO() {
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    @Override
    public String toString() {
        return "PersonsDTO{" +
                "personList=" + personList +
                '}';
    }
}
