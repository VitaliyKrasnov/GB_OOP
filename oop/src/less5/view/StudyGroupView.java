package less5.view;

import java.util.List;

import less5.model.Teacher;
import less5.model.User;

public class StudyGroupView implements UserView<User> {

    @Override
    public void sendOnConsole(List<User> users) {
        User teacher = null;
        for (User user : users) {
            if (user instanceof Teacher) {
                teacher = user;
                break;
            }
        }

        if (teacher == null) {
            System.out.println("У группы нет учителя!");
        } else {
            System.out.println("Учитель " + teacher.toString());
        }
      
        for (User user : users) {
            if (!(user instanceof Teacher)) {
                System.out.println("Студент " + user.toString());
            }
        }
    }

}
