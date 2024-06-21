package less4.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import less4.model.StudentGroup;
import less4.model.Student;

public class StudentsGroupService {
    Map<String, StudentGroup> groups = new HashMap<>();

    public void createGroup(String groupName, Student... students) {
        StudentGroup group = new StudentGroup(groupName);
        System.out.printf("Список группы '%s':\n", groupName);
        for (Student student : students) {
            group.addStudent(student);
            System.out.println("Имя: " + student.getFullName() 
            + ", id: " + student.getId());
        }
        groups.put(groupName, group);
    }

    public StudentGroup getGroup(String groupName) {
        return groups.get(groupName);
    }

    public List<Student> getSortedGroup(String groupName, Comparator<Student> comparator) {
        StudentGroup group = groups.get(groupName);
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
