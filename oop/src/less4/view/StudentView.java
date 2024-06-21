package less4.view;

import java.util.List;

import less4.model.Student;


public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> students) {
        for (Student student : students) {
            System.out.println("Студент " + student.toString());
        }
    }

}
