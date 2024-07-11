package less6.homework;

/**
 * Класс отвечает за формирование отчёта по пользователю
 * в соответсвии с принципом S
 * 
 * Так же в соовт. с принципом I разделили интерфейсы сохранения пользователя
 * в БД и получение отчёта
 */
public class Reporter implements IReporter<IUser> {

    /**
     * формируем очтёт по пользователю у которого реализован метод getName
     * Реализация прицнипа L
     * 
     * @param user
     */
    public void report(IUser user) {
        System.out.println("Report for user: " + user.getName());
    }
}
