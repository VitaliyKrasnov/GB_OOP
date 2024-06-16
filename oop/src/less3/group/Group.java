package less3.group;

import java.util.Iterator;
import less3.student.Student;

public class Group implements Iterable<Student> {

    private final String name;
    private StringBuilder students = new StringBuilder();

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.append(student).append(":").append(student.id).append(" ");
    }

    public String getGroupName() {
        return name;
    }

    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(this);
    }

    // внутренний класс реализующий Iterator
    private class GroupIterator implements Iterator<Student> {

        private final Group studentGroup;
        private int index = 0;

        public GroupIterator(Group group) {
            this.studentGroup = group;
        }

        private Student[] getStudents() {
            String[] names = studentGroup.students.toString().split(" ");
            Student[] students = new Student[names.length];

            int count = 0;
            for (String name : names) {
                students[count] = new Student(name, Integer.parseInt(name.substring(name.indexOf(":") + 1)));
                count++;
            }
            return students;
        }

        @Override
        public boolean hasNext() {
            return index < getStudents().length;
        }

        @Override
        public Student next() {
            Student[] students = getStudents();
            return students[index++];
        }

    }
}
