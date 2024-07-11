package less6.homework;

public class Main {

    /** В соответствии с принципом D добавляем зависимости на классы для получения отчёта 
     * и сохранения в БД
     */

    static IPersister<User> userPersister = new UserPersister();
    static IReporter<User> userReporter = new UserReporter();
    public static void main(String[] args){
        User user = new User("Bob");
        userReporter.report(user);
        userPersister.save(user);
    }
}