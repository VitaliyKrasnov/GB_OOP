package less5.service;

import java.util.ArrayList;
import java.util.List;

import less5.model.Student;
import less5.model.Teacher;
import less5.model.User;

public class DataService {

    private final List<User> users = new ArrayList<>();

    public void createStudent(String name, String surame) {
        int id = 1;
        for (User user : users) {
            if (user instanceof Student) {
                id++;
            }
        }
        Student student = new Student(name, surame, id);
        users.add(student);
    }

    public void createTeacher(String name, String middlename, String surame) {
        int id = 1;
        for (User user : users) {
            if (user instanceof Teacher) {
                id++;
            }
        }
        Teacher teacher = new Teacher(name, middlename, surame, id);
        users.add(teacher);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student) {
                students.add((Student)user);
            }
        }
        return students;
    }

    public List<Student> getStudentsByIds(int ...ids) {
        List<Student> students = new ArrayList<>();
        for (int id : ids) {
            for (User user : users) {
                if (user instanceof Student && user.getId() == id) {
                    students.add((Student) user);
                }
            }
        }
        return students;
    }

    public List<Teacher> getTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher) {
                teachers.add((Teacher) user);
            }
        }
        return teachers;
    }

    public Teacher getTeacherByFullName(String name, String middlename, String surname) {
        User teacher = null;
        for (User user : users) {
            if (user instanceof Teacher && user.getFullName().equals(name + " " + middlename + " " + surname)) {
                teacher = user;
            }
        }
        return (Teacher)teacher;
    }

}
