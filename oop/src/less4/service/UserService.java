package less4.service;

import less4.model.User;

public interface UserService<T extends User> {

    T createUser(String name, String surname);

}
