package less5.view;

import java.util.List;

import less5.model.Teacher;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            System.out.println("Учитель " + teacher.toString());
        }
    }

}
