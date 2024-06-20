package less4.controller;

import java.util.List;

import less4.model.Student;
import less4.service.StudentService;
import less4.view.StudentsView;

public class StudentController implements UserController<Student> {

    StudentService studentService = new StudentService();
    StudentsView studentsView = new StudentsView();

    @Override
    public Student create(String name, String surname) {
        return studentService.creatStudent(name, surname);
    }

    public void sendOnConsole(List<Student> students) {
        studentsView.sendOnConsole(students);
    }

}
