package Test;

import Exceptions.InformacionInvalida;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestQueue {
    //------------- Test queue ----------------------------
    @org.junit.jupiter.api.Test
    public void test4() throws InformacionInvalida {
        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
        prueba.enqueue(2);
        prueba.enqueue(33);
        prueba.enqueue(754);
        assertTrue(prueba.contains(33));
    }
    @org.junit.jupiter.api.Test
    public void test5() throws InformacionInvalida {
        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
        prueba.enqueue(2);
        prueba.enqueue(33);
        prueba.enqueue(754);
        assertEquals(3,prueba.size());
    }
    @org.junit.jupiter.api.Test
    public void test6() throws Exceptions.EmptyQueueException, InformacionInvalida {
        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
        prueba.enqueue(2);
        prueba.enqueue(33);
        prueba.enqueue(754);
        assertEquals(2,prueba.dequeue());
    }
}
