package less3.stream;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream sgs1, Stream sgs2) {
        return sgs1.getNumberOfGroups() - sgs2.getNumberOfGroups();
    }

}
