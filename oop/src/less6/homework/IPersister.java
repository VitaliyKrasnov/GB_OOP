package less6.homework;

public interface IPersister<U extends User> {

    public void save(U user);

}
