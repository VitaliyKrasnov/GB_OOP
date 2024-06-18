package less4.controller;

import less4.model.Student;

public class StudentController {

    public Student creaStudent(String name, String surname, int id) {
        return new Student (name, surname);
    }

}
