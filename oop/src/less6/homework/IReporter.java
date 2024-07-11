package less6.homework;

public interface IReporter<U extends IUser> {

    public void report(U user);

}
