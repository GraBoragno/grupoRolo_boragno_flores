package TADS;

import Exceptions.EmptyQueueException;
import Exceptions.InformacionInvalida;

public interface MyQueue<T> {

    void enqueue(T value) throws InformacionInvalida;

    T dequeue() throws EmptyQueueException;

    boolean contains(T value);

    int size();

}
