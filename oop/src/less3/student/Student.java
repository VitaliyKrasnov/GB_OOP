package less3.student;
/**
 * Student
 */
public class Student implements Comparable<Student> {

    public String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.length() - o.name.length();
    }
}