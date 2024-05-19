import Exceptions.InformacionInvalida;

import java.util.EmptyStackException;

public interface MyStack<T> {

    void push(T value) throws InformacionInvalida;

    T pop() throws EmptyStackException;

    T top();

    int size();

}
