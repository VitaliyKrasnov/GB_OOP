package less5.service;

import java.util.List;

import less5.model.Student;
import less5.model.StudyGroup;
import less5.model.Teacher;

public class StudyGroupService {

    public StudyGroup getStudyGroup(String groupName, Teacher teacher, List<Student> students) {
        return new StudyGroup(groupName, teacher, students);
    }

}
