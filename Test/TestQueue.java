package Test;

import Exceptions.EmptyListException;
import Exceptions.EmptyQueueException;
import Exceptions.InformacionInvalida;
import Exceptions.PosicionInvalida;
import TADS.LinkedListImpl;
import TADS.MyList;
import TADS.MyQueue;
import TADS.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQueue {
    //------------- Test queue ----------------------------
    @org.junit.jupiter.api.Test
    public void testContains1() throws InformacionInvalida {
        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
        prueba.enqueue(2);
        prueba.enqueue(33);
        prueba.enqueue(754);
        assertTrue(prueba.contains(33));
    }
    @org.junit.jupiter.api.Test
    public void testSize1() throws InformacionInvalida {
        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
        prueba.enqueue(2);
        prueba.enqueue(33);
        prueba.enqueue(754);
        assertEquals(3,prueba.size());
    }
    @org.junit.jupiter.api.Test
    public void testDequeue1() throws Exceptions.EmptyQueueException, InformacionInvalida {
        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
        prueba.enqueue(2);
        prueba.enqueue(33);
        prueba.enqueue(754);
        assertEquals(2,prueba.dequeue());
    }
    @Test
    public void testDequeue() throws InformacionInvalida, EmptyQueueException{
        MyQueue<Integer> prueba = new LinkedListImpl<>();
        assertThrows(EmptyQueueException.class, prueba::dequeue);
    }
    @Test
    public void testEnqueue1() throws InformacionInvalida{
        MyQueue<Integer> prueba = new LinkedListImpl<>();
        assertThrows(InformacionInvalida.class, () -> {
            prueba.enqueue(null);
        });
    }
}
