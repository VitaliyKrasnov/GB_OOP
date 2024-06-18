package less3.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import less3.student.Student;

public class Group implements Iterable<Student> {

    private final String name;
    private List<Student> students = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getGroupName() {
        return name;
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }
    
}
