package less6.homework;

/**
 * Убрали лишние методы из класса в соотв. с принципом S
 * Класс открыт для расширения и закрыт для модификации в соотв. с принципом O
 * т.е. можем добавлять новые поля перегружая конструктор при этом метод getName
 * не изменяется
 */
public class User implements IUser{
    private final String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }


}
