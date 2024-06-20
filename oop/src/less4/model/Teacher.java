package less4.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private List<Group> groups = new ArrayList<>();

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

}
