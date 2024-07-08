package less5.util;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

import less4.model.User;

public class UserFullNameComparator<T extends User> implements Comparator<T> {

    private final Collator collator = Collator.getInstance(new Locale("ru"));

    @Override
    public int compare(T u1, T u2) {
        return collator.compare(u1.getFullName(), u2.getFullName());
    }

}
