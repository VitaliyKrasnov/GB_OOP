package less4.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {

    private final String name;
    private List<Student> students = new ArrayList<>();

    public StudentGroup(String name) {
        this.name = name;
    }

    public void addStudent(Student user) {
        students.add(user);
    }

    public String getGroupName() {
        return name;
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
    
}
