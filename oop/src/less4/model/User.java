package less4.model;

import java.text.Collator;
import java.util.Locale;

public abstract class User implements Comparable<User> {

    private static int index = 0;

    private final Collator collator = Collator.getInstance(new Locale("ru"));

    private final String name;
    private final String surname;
    private final int id;
    
    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = index++;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public int getId() {
        return id;
    }

    public abstract boolean isTeacher();

    @Override
    public String toString() {
        return name + " " + surname + ", id: " + id;
    }

    @Override
    public int compareTo(User s) {
        return collator.compare(this.getFullName(), s.getFullName());
    }


}
