package less5.util;

import java.util.Comparator;

import less4.model.User;

public class UserIdComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T u1, T u2) {
        return u1.getId() - u2.getId();
    }

}