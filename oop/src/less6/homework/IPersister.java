package less6.homework;

public interface IPersister<U extends IUser> {

    public void save(U user);

}
