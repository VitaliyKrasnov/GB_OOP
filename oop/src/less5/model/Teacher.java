package less5.model;

public class Teacher extends User {

    private final String middlename;

    public Teacher(String name, String middlename, String surname, int id) {
        super(name, surname, id);
        this.middlename = middlename;
    }

    public String getFullName() {
        return getName() + " " + middlename + " " + getSurname();
    }

    
}
