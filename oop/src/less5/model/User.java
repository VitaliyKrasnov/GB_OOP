package less5.model;

import java.text.Collator;
import java.util.Locale;

public abstract class User implements Comparable<User> {

    private final Collator collator = Collator.getInstance(new Locale("ru"));

    private final String name;
    private final String surname;
    private final int id;
    
    public User(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String getFullName();

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return getFullName() + ", id: " + id;
    }

    @Override
    public int compareTo(User s) {
        return collator.compare(this.getFullName(), s.getFullName());
    }


}
