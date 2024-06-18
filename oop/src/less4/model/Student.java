package less4.model;

import java.text.Collator;
import java.util.Locale;

/**
 * Student
 */
public class Student implements Comparable<Student> {
    private static int index = 0;

    private final Collator collator = Collator.getInstance(new Locale("ru"));

    private final String name;
    private final String surname;
    private final int id;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = index++;
    }

    public String getName() {
        return name + " " + surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", id: " + id;
    }

    @Override
    public int compareTo(Student s) {
        return collator.compare(this.getName(), s.getName());
    }

}
