package less6.homework;

/**
 * Класс отвечает за сохранение пользователя
 * в соответсвии с принципом S
 * 
 * Так же в соовт. с принципом I разделили интерфейсы сохранения пользователя в БД
 * и получение отчёта
 */
public class Persister implements IPersister<IUser> {

    /**
     * сохраняем объект у которого реализован метод getName
     * Реализация прицнипа L
     * @param user
     */
    @Override
    public void save(IUser user) {
        System.out.println("Save user: " + user.getName());
    }

}
