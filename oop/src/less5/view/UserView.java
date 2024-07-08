package less5.view;

import java.util.List;

import less5.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> users);

}
