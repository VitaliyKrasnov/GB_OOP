package less3;

import java.util.List;

import less3.group.Group;
import less3.stream.Stream;
import less3.student.Student;

public class Program {

    private GroupService groupService = new GroupService();

    public static void main(String[] args) {
        Program program = new Program();
        program.run();
    }

    private void run() {
        groupService.createStudentGroup(
            "group1",
            new Student("Van", 4)
            ,new Student("Igorechick", 1)
            ,new Student("Alex", 2)
            ,new Student("Alexey", 3)
         );
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group1");
        System.out.println(groupService.getSortedStudents("group1", (s1, s2) -> s1.id - s2.id));

        groupService.createStudentGroup(
                 "group2",
                 new Student("Olga", 5)
                 , new Student("Victoria", 2)
                 , new Student("Ann", 4)
                 , new Student("Aleksandra", 3)
                 , new Student("Ira", 1));
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group2");
        System.out.println(groupService.getSortedStudents("group2", null));

         groupService.createStudentGroup(
                 "group3",
                 new Student("Oleg", 3)
                 , new Student("Dasha", 1)
                 , new Student("Oksana", 4)
                 , new Student("Mikhail", 2));
        
        System.out.printf("Отсортированный список студентов для группы '%s'\n", "group3");
        System.out.println(groupService.getSortedStudents("group3", null));

        groupService.createStudentGroup(
                 "group4",
                 new Student("Vasya", 3)
                 , new Student("Dina", 1)
                 , new Student("Yulya", 2));         
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