package less4.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import less4.model.Group;
import less4.model.Student;

public class GroupService {
    Map<String, Group> groups = new HashMap<>();

    public void createStudentGroup(String groupName, Student... students) {
        Group group = new Group(groupName);
        System.out.printf("Список студентов группы '%s':\n", groupName);
        for (Student student : students) {
            group.addStudent(student);
            System.out.println("Имя: " + student.getName() + ", id: " + student.getId());
        }
        groups.put(groupName, group);
    }

    public Group getGroup(String groupName) {
        return groups.get(groupName);
    }

    public List<Student> getSortedStudents(String groupName, Comparator<Student> comparator) {
        Group group = groups.get(groupName);
        List<Student> students = new ArrayList<>();
        for (Student student : group) {
            students.add(student);
        }

        if (comparator != null) {
            Collections.sort(students, comparator);
        } else {
            Collections.sort(students);
        }
        return students;
    }
    
}
