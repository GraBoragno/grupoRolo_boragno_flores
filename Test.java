
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class Test {

    // --------------- Test Satck ---------------------------
//    @org.junit.jupiter.api.Test
//    public void test(){
//        MyStack<Integer> prueba = new LinkedListImpl<>();
//        prueba.push(2);
//        prueba.push(5);
//        prueba.push(23);
//        assertEquals(23, prueba.peek());
//    }
//    @org.junit.jupiter.api.Test
//    public void test2() throws EmptyStackException {
//        MyStack<Integer> prueba = new LinkedListImpl<>();
//        prueba.push(2);
//        prueba.push(5);
//        prueba.push(7);
//        assertEquals(7, prueba.pop());
//    }
//    @org.junit.jupiter.api.Test
//    public void test3() throws EmptyStackException {
//        MyStack<Integer> prueba = new LinkedListImpl<>();
//        prueba.push(2);
//        prueba.push(5);
//        prueba.push(7);
//        assertEquals(3, prueba.size());
//    }
//
//    //------------- Test queue ----------------------------
//    @org.junit.jupiter.api.Test
//    public void test4(){
//        MyQueue<Integer> prueba = new LinkedListImpl<>();
//        prueba.enqueue(2);
//        prueba.enqueue(33);
//        prueba.enqueue(754);
//        assertTrue(prueba.contains(33));
//    }
//    @org.junit.jupiter.api.Test
//    public void test5(){
//        MyQueue<Integer> prueba = new LinkedListImpl<>();
//        prueba.enqueue(2);
//        prueba.enqueue(33);
//        prueba.enqueue(754);
//        assertEquals(3,prueba.size());
//    }
//    @org.junit.jupiter.api.Test
//    public void test6() throws EmptyQueueException {
//        MyQueue<Integer> prueba = new LinkedListImpl<>();
//        prueba.enqueue(2);
//        prueba.enqueue(33);
//        prueba.enqueue(754);
//        assertEquals(2,prueba.dequeue());
//    }

    // --------------------- Test List ----------------------
    @org.junit.jupiter.api.Test
    public void testListGet1() throws PosicionInvalida{
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(45);
        assertEquals(101, prueba.get(1));
    }
    @org.junit.jupiter.api.Test
    public void testListGet2() throws PosicionInvalida {
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertThrows(PosicionInvalida.class, () -> {
            prueba.get(-1);
        });
    }
    @org.junit.jupiter.api.Test
    public void testListGet3() throws PosicionInvalida {
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertThrows(PosicionInvalida.class, () -> {
            prueba.get(5);
        });
    }
    @org.junit.jupiter.api.Test
    public void testListSize1(){
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(45);
        assertEquals(3, prueba.size());
    }
    @org.junit.jupiter.api.Test
    public void testListSize2(){
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertEquals(0, prueba.size());
    }
    @org.junit.jupiter.api.Test
    public void testListRemove1() throws InformacionInvalida, EmptyListException {
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.remove(56);
        assertEquals(1, prueba.size());
    }
    @org.junit.jupiter.api.Test
    public void testListRemove2() throws InformacionInvalida, EmptyListException {
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        assertThrows(InformacionInvalida.class, () -> {
            prueba.remove(2);
        });
    }
    @org.junit.jupiter.api.Test
    public void testListRemove3() throws InformacionInvalida, PosicionInvalida {
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertThrows(EmptyListException.class, () -> {
            prueba.remove(5);
        });
    }
    @org.junit.jupiter.api.Test
    public void testListContins1(){
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(45);
        assertTrue( prueba.contains(101));
    }
    @org.junit.jupiter.api.Test
    public void testListContains2(){
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(45);
        assertFalse(prueba.contains(3));
    }
}
