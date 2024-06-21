package less4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import less4.controller.StudentsGroupController;
import less4.controller.StreamController;
import less4.controller.StudentController;
import less4.controller.TeacherController;
import less4.model.StudentGroup;
import less4.model.Stream;
import less4.model.Student;
import less4.model.Teacher;
import less4.util.UserFullNameComparator;
import less4.util.UserIdComparator;

public class Program {

    StudentsGroupController groupController = new StudentsGroupController();

    StreamController streamController = new StreamController();

    StudentController studentController = new StudentController();

    TeacherController teacherController = new TeacherController();

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }

    private void run() {
        groupController.createGroup(
            "group1",
            new Student("Иван", "Иванов")
            ,new Student("Игорь", "Игорев")
            ,new Student("Алексей", "Алексеев")
            ,new Student("Алексей", "Воронов")
         );
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group1");
        System.out.println(groupController.getSortedGroup("group1", (s1, s2) -> s1.getId() - s2.getId()));

        groupController.createGroup(
                 "group2",
                 new Student("Ольга", "Ольгова")
                 , new Student("Виктория", "Ольгова")
                 , new Student("Анна", "Ивановова")
                 , new Student("Анна", "Иванова")
                 , new Student("Александра", "Бодрова")
                 );
        System.out.printf("Отсортированный по полному имени список студентов для группы '%s'\n", "group2");
        System.out.println(groupController.getSortedGroup("group2", new UserFullNameComparator<>()));

        System.out.printf("Отсортированный по ID список студентов для группы '%s'\n", "group2");
        System.out.println(groupController.getSortedGroup("group2", new UserIdComparator<>()));

         groupController.createGroup(
                 "group3",
                 new Student("Олег", "Олегов")
                 , new Student("Дарья", "Дарьянова")
                 , new Student("Оксана", "Аксёнова")
                 , new Student("Михаил", "Михайлов"));
        
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group3");
        System.out.println(groupController.getSortedGroup("group3", null));

        groupController.createGroup(
                 "group4",
                 new Student("Василий", "Ягодин")
                 , new Student("Диана", "Дианова")
                 , new Student("Юлия", "Юльева"));         
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group4");
        System.out.println(groupController.getSortedGroup("group4", null));

        streamController.addStream("programmer"
        , groupController.getGroup("group1")
        , groupController.getGroup("group3")
        , groupController.getGroup("group4"));

        streamController.addStream("design"
        , groupController.getGroup("group2"));

        System.out.println("Список групп в потоке 'programmer'");
        for (StudentGroup group : streamController.getStream("programmer")) {
            System.out.println(group.getGroupName());
        }    

        System.out.println("Список групп в потоке 'design'");
        for (StudentGroup group : streamController.getStream("design")) {
            System.out.println(group.getGroupName());
        }

        streamController.printListOfStreams();

        List<Stream> sortedStream = streamController.getSortedStreams(null);
        System.out.println("Отсортированный список потоков:");
        System.out.println(sortedStream);


        System.out.println("Студенты группы 'group3' отсортированные по id");
        studentController.sendOnConsole(groupController.getSortedGroup("group3", (s1, s2) -> s1.getId() - s2.getId()));

        System.out.println("Создаём учителей:");
        Teacher teacher1 = teacherController.create("Валентин Петрович", "Иванов");
        Teacher teacher2 = teacherController.create("Сергей Иванович", "Петров");
        Teacher teacher3 = teacherController.create("Анна Владимировна", "Сидорова");
        List<Teacher> teachers = Arrays.asList(teacher1, teacher2, teacher3);
        teachers.sort(new UserFullNameComparator<>());
        teacherController.sendOnConsole(teachers);
    }

}