package less5.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<User> {

    private final String groupName;
    private final Teacher teacher;
    private final List<Student> students;

    public StudyGroup(String groupName, Teacher teacher, List<Student> students) {
        this.groupName = groupName;
        this.teacher = teacher;
        this.students = students;
    }

    public String getGroupName() {
        return groupName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) return student;
        }

        return null;
    }

    public List<User> getStudyGroupUsers() {
        List<User> studyGroupUsers = new ArrayList<>();
        studyGroupUsers.add(getTeacher());
        studyGroupUsers.addAll(getStudents());
        return studyGroupUsers;
    }

    @Override
    public Iterator<User> iterator() {
        List<User> studyGroupUsers = new ArrayList<>();
        studyGroupUsers.add(getTeacher());
        studyGroupUsers.addAll(getStudents());
        return studyGroupUsers.iterator();
    }

}
