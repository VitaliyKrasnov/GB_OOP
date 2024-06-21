package less4.service;

import less4.model.Student;

public class StudentService implements UserService<Student> {

    @Override
    public Student createUser(String name, String surname) {
        return new Student (name, surname);
    }

}
