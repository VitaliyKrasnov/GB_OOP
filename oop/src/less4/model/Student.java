package less4.model;

/**
 * Student
 */
public class Student extends User {

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public boolean isTeacher() {
        return false;
    }

}
