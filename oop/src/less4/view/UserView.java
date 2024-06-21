package less4.view;

import java.util.List;

import less4.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> users);

}
