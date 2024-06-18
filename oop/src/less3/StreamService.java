package less3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import less3.group.Group;
import less3.stream.Stream;

public class StreamService {

    private List<Stream> streams = new ArrayList<>();

    public void addStream(String stremaName, Group... groups) {
        Stream stream = new Stream(stremaName);
        for (Group group : groups) {
            stream.addGroup(group); 
        }
        streams.add(stream);
    }

    public Stream getStream(String name) {
        for (Stream stream : streams) {
            if (name.equals(stream.getStreamName())) {
                return stream;
            }
        }
        System.out.printf("Не найден поток с именем '%s'\n", name);
        return null;
    }

    public void printListOfStreams() {
        System.out.println("Список потоков:");
        for (Stream stream : streams) {
            System.out.printf("Поток '%s', число групп в потоке: '%d'\n"
            , stream.getStreamName()
            , stream.getNumberOfGroups());
        }
    }

    public List<Stream> getSortedStreams(Comparator<Stream> comparator) {
        List<Stream> tmp = new ArrayList<>(streams.size());
        tmp.addAll(streams);
        if (comparator != null) {
            Collections.sort(tmp, comparator);
        } else {
            Collections.sort(tmp, (stream1, stream2) -> stream1.getNumberOfGroups() - stream2.getNumberOfGroups());
        }
        
        return tmp;
    }

}
