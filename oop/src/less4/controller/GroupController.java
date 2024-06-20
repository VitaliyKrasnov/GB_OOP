package less4.controller;

import java.util.Comparator;
import java.util.List;

import less4.model.Group;
import less4.model.Student;
import less4.service.GroupService;

public class GroupController {

    private GroupService groupService = new GroupService();

    public void createStudentGroup(String groupName, Student... students) {
        groupService.createStudentGroup(groupName, students);
    }

    public List<Student> getSortedStudents(String groupName, Comparator<Student> comparator) {
        return groupService.getSortedStudents(groupName, comparator);
    }

    public Group getGroup(String groupName) {
        return groupService.getGroup(groupName);
    }


}
