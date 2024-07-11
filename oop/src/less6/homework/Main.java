package less6.homework;

public class Main {

    /** В соответствии с принципом D добавляем зависимости на классы для получения отчёта 
     * и сохранения в БД
     */

    static IPersister<IUser> persister = new Persister();
    static IReporter<IUser> reporter = new Reporter();
    public static void main(String[] args){
        IUser user = new User("Bob");
        reporter.report(user);
        persister.save(user);
    }
}