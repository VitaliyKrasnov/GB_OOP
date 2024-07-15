package less7.service;

public interface Calc<T> {

    T addOperation(T op1, T op2);

    T subOperation(T op1, T op2);

}
