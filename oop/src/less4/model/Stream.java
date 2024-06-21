package less4.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private final String name;
    private List<StudentGroup> stream = new ArrayList<>();

    public Stream(String name) {
        this.name = name;
    }

    public void addGroup(StudentGroup group) {
        stream.add(group);
        System.out.printf("В поток '%s' добавлена группа студентов '%s'\n", name, group.getGroupName());
    }

    public int getNumberOfGroups() {
        return stream.size();
    }

    public String getStreamName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ":" + stream.size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
       return stream.iterator();
    }
    
}
