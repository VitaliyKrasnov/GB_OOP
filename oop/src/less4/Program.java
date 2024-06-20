package less4;

import java.util.List;

import less4.controller.GroupController;
import less4.controller.StreamController;
import less4.controller.StudentController;
import less4.model.Group;
import less4.model.Stream;
import less4.model.Student;
import less4.util.UserComparator;

public class Program {

    GroupController groupController = new GroupController();

    StreamController streamController = new StreamController();

    StudentController studentController = new StudentController();

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }

    private void run() {
        groupController.createStudentGroup(
            "group1",
            new Student("Иван", "Иванов")
            ,new Student("Игорь", "Игорев")
            ,new Student("Алексей", "Алексеев")
            ,new Student("Алексей", "Воронов")
         );
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group1");
        System.out.println(groupController.getSortedStudents("group1", (s1, s2) -> s1.getId() - s2.getId()));

        groupController.createStudentGroup(
                 "group2",
                 new Student("Ольга", "Ольгова")
                 , new Student("Виктория", "Ольгова")
                 , new Student("Анна", "Ивановова")
                 , new Student("Анна", "Иванова")
                 , new Student("Александра", "Бодрова")
                 );
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group2");
        System.out.println(groupController.getSortedStudents("group2", new UserComparator<>()));

         groupController.createStudentGroup(
                 "group3",
                 new Student("Олег", "Олегов")
                 , new Student("Дарья", "Дарьянова")
                 , new Student("Оксана", "Аксёнова")
                 , new Student("Михаил", "Михайлов"));
        
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group3");
        System.out.println(groupController.getSortedStudents("group3", null));

        groupController.createStudentGroup(
                 "group4",
                 new Student("Василий", "Ягодин")
                 , new Student("Диана", "Дианова")
                 , new Student("Юлия", "Юльева"));         
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group4");
        System.out.println(groupController.getSortedStudents("group4", null));

        streamController.addStream("programmer"
        , groupController.getGroup("group1")
        , groupController.getGroup("group3")
        , groupController.getGroup("group4"));

        streamController.addStream("design"
        , groupController.getGroup("group2"));

        System.out.println("Список групп в потоке 'programmer'");
        for (Group group : streamController.getStream("programmer")) {
            System.out.println(group.getGroupName());
        }    

        System.out.println("Список групп в потоке 'design'");
        for (Group group : streamController.getStream("design")) {
            System.out.println(group.getGroupName());
        }

        streamController.printListOfStreams();

        List<Stream> sortedStream = streamController.getSortedStreams(null);
        System.out.println("Отсортированный список потоков:");
        System.out.println(sortedStream);


        System.out.println("Студенты группы 'group3' отсортированные по id");
        studentController.sendOnConsole(groupController.getSortedStudents("group3", (s1, s2) -> s1.getId() - s2.getId()));
    }

}