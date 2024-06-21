package less4.controller;

import java.util.Comparator;
import java.util.List;

import less4.model.StudentGroup;
import less4.model.Student;
import less4.service.StudentsGroupService;

public class StudentsGroupController {

    private StudentsGroupService groupService = new StudentsGroupService();

    public void createGroup(String groupName, Student... students) {
        groupService.createGroup(groupName, students);
    }

    public List<Student> getSortedGroup(String groupName, Comparator<Student> comparator) {
        return groupService.getSortedGroup(groupName, comparator);
    }

    public StudentGroup getGroup(String groupName) {
        return groupService.getGroup(groupName);
    }


}
