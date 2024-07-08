package less5;

import less5.controller.Controller;
import less5.model.StudyGroup;

public class Program {

    Controller controller = new Controller();

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }

    private void run() {
        controller.createStudent("Иван", "Иванов");
        controller.createStudent("Игорь", "Игорев");
        controller.createStudent("Алексей", "Алексеев");
        controller.createStudent("Алексей", "Воронов");
        System.out.println("Список студентов:");
        controller.viewStudents();

        controller.createTeacher("Иван", "Иванович", "Иванов");
        controller.createTeacher("Игорь", "Игоревич", "Игорев");
        controller.createTeacher("Алексей", "Алексеевич", "Алексеев");
        controller.createTeacher("Алексей", "Александрович", "Воронов");
        System.out.println("Список учителей:");
        controller.viewTeachers();

        StudyGroup studyGroup = controller.createStudyGroup("group1"
            , controller.getTeacherByFullName("Алексей", "Алексеевич", "Алексеев")
            , controller.getStudentsByIds(1,2));
        System.out.println("//////////////////////////////");
        System.out.println("/// Учебная группа " + studyGroup.getGroupName() + ":");
        System.out.println("//////////////////////////////");
        controller.viewStudyGroup(studyGroup);
    }

}