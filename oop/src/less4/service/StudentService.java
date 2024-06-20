package less4.service;

import less4.model.Student;

public class StudentService {

    public Student creatStudent(String name, String surname) {
        return new Student (name, surname);
    }


}
