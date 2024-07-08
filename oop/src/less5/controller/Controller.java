package less5.controller;

import java.util.List;

import less5.model.Student;
import less5.model.StudyGroup;
import less5.model.Teacher;
import less5.model.User;
import less5.service.DataService;
import less5.service.StudyGroupService;
import less5.view.StudentView;
import less5.view.StudyGroupView;
import less5.view.TeacherView;
import less5.view.UserView;

public class Controller {

    private final DataService dataService = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final UserView<Student> studentView = new StudentView();
    private final UserView<Teacher> teacherView = new TeacherView();
    private final UserView<User> studyGroupView = new StudyGroupView();

    public void createStudent(String name, String surname) {
        dataService.createStudent(name, surname);
    }

    public void createTeacher(String name, String middlename, String surname) {
        dataService.createTeacher(name, middlename, surname);
    }

    public StudyGroup createStudyGroup(String groupName, Teacher teacher, List<Student> students) {
        return studyGroupService.getStudyGroup(groupName, teacher, students);
    }

    public List<Student> getStudents() {
        return dataService.getStudents();
    }

    public List<Teacher> getTeachers() {
        return dataService.getTeachers();
    }

    public List<Student> getStudentsByIds(int ...ids) {
        return dataService.getStudentsByIds(ids);
    }

    public Teacher getTeacherByFullName(String name, String middlename, String surname) {
        return dataService.getTeacherByFullName(name, middlename, surname);
    }

    public void viewStudents() {
        studentView.sendOnConsole(getStudents());
    }

    public void viewTeachers() {
        teacherView.sendOnConsole(getTeachers());
    }

    public void viewStudyGroup(StudyGroup studyGroup) {
        studyGroupView.sendOnConsole(studyGroup.getStudyGroupUsers());
    }


}
