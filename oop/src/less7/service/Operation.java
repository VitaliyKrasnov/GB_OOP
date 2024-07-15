package less7.service;

public interface Operation<T> {

    T eval(T op1, T op2);

}
