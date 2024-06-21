package less4.controller;

import java.util.List;

import less4.model.Student;
import less4.service.StudentService;
import less4.view.StudentView;

public class StudentController implements UserController<Student> {

    StudentService studentService = new StudentService();
    StudentView studentsView = new StudentView();

    @Override
    public Student create(String name, String surname) {
        return studentService.createUser(name, surname);
    }

    public void sendOnConsole(List<Student> students) {
        studentsView.sendOnConsole(students);
    }

}
