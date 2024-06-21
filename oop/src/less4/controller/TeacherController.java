package less4.controller;

import java.util.List;

import less4.model.Teacher;
import less4.service.TeacherService;
import less4.view.TeacherView;

public class TeacherController implements UserController<Teacher> {

    TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();

    @Override
    public Teacher create(String name, String surname) {
        return teacherService.createUser(name, surname);
    }

    public void sendOnConsole(List<Teacher> students) {
        teacherView.sendOnConsole(students);
    }

}
