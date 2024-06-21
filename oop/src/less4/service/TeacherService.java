package less4.service;

import less4.model.Teacher;

public class TeacherService implements UserService<Teacher> {

    public Teacher createUser(String name, String surname) {
        return new Teacher(name, surname);
    }

}
