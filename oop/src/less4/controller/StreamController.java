package less4.controller;

import java.util.Comparator;
import java.util.List;

import less4.model.Group;
import less4.model.Stream;
import less4.service.StreamService;

public class StreamController {

    private StreamService streamService = new StreamService();

    public void addStream(String stremaName, Group... groups) {
        streamService.addStream(stremaName, groups);
    }

    public Stream getStream(String name) {
        return streamService.getStream(name);
    }

    public void printListOfStreams() {
        streamService.printListOfStreams();
        System.out.println("Список потоков:");
    }

    public List<Stream> getSortedStreams(Comparator<Stream> comparator) {
        return streamService.getSortedStreams(comparator);
    }

}
