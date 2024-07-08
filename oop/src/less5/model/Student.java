package less5.model;

public class Student extends User {

    public Student(String name, String surname, int id) {
        super(name, surname, id);
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }


}
