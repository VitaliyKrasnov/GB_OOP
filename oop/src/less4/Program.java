package less4;

import java.util.List;

import less4.service.StreamService;
import less4.service.GroupService;
import less4.model.Group;
import less4.model.Stream;
import less4.model.Student;

public class Program {

    private GroupService groupService = new GroupService();

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }

    private void run() {
        groupService.createStudentGroup(
            "group1",
            new Student("Иван", "Иванов")
            ,new Student("Игорь", "Игорев")
            ,new Student("Алексей", "Алексеев")
            ,new Student("Алексей", "Воронов")
         );
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group1");
        System.out.println(groupService.getSortedStudents("group1", (s1, s2) -> s1.getId() - s2.getId()));

        groupService.createStudentGroup(
                 "group2",
                 new Student("Ольга", "Ольгова")
                 , new Student("Виктория", "Ольгова")
                 , new Student("Анна", "Иванова")
                 , new Student("Александра", "Бодрова")
                 , new Student("Ирина", "Хорошова"));
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group2");
        System.out.println(groupService.getSortedStudents("group2", null));

         groupService.createStudentGroup(
                 "group3",
                 new Student("Олег", "Олегов")
                 , new Student("Дарья", "Дарьянова")
                 , new Student("Оксана", "Аксёнова")
                 , new Student("Михаил", "Михайлов"));
        
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group3");
        System.out.println(groupService.getSortedStudents("group3", null));

        groupService.createStudentGroup(
                 "group4",
                 new Student("Василий", "Ягодин")
                 , new Student("Диана", "Дианова")
                 , new Student("Юлия", "Юльева"));         
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group4");
        System.out.println(groupService.getSortedStudents("group4", null));

        StreamService streamService = new StreamService();
        streamService.addStream("programmer"
        , groupService.getGroup("group1")
        , groupService.getGroup("group3")
        , groupService.getGroup("group4"));

        streamService.addStream("design"
        , groupService.getGroup("group2"));

        System.out.println("Список групп в потоке 'programmer'");
        for (Group group : streamService.getStream("programmer")) {
            System.out.println(group.getGroupName());
        }    

        System.out.println("Список групп в потоке 'design'");
        for (Group group : streamService.getStream("design")) {
            System.out.println(group.getGroupName());
        }

        streamService.printListOfStreams();

        List<Stream> sortedStream = streamService.getSortedStreams(null);
        System.out.println("Отсортированный список потоков:");
        System.out.println(sortedStream);
    }

}