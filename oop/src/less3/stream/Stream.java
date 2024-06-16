package less3.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import less3.group.Group;

public class Stream implements Iterable<Group> {

    private final String name;
    private List<Group> stream = new ArrayList<>();

    public Stream(String name) {
        this.name = name;
    }

    public void addGroup(Group group) {
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
    public Iterator<Group> iterator() {
       return stream.iterator();
    }
    
}
