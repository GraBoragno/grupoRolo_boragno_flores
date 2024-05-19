package Test;

import Exceptions.EmptyListException;
import Exceptions.InformacionInvalida;
import static org.junit.jupiter.api.Assertions.*;
import Exceptions.PosicionInvalida;
import TADS.LinkedListImpl;
import TADS.MyList;
import org.junit.jupiter.api.Test;

public class TestList {

    @Test
    public void testListAdd1() throws InformacionInvalida {
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertThrows(InformacionInvalida.class, () -> {
            prueba.add(null);
        });
    }

    @Test
    public void testListGet1() throws PosicionInvalida, InformacionInvalida{
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(45);
        assertEquals(101, prueba.get(1));
    }
    @Test
    public void testListGet2() throws PosicionInvalida {
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertThrows(PosicionInvalida.class, () -> {
            prueba.get(-1);
        });
    }
    @Test
    public void testListGet3() throws PosicionInvalida {
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertThrows(PosicionInvalida.class, () -> {
            prueba.get(5);
        });
    }
    @Test
    public void testListSize1() throws InformacionInvalida{
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(45);
        assertEquals(3, prueba.size());
    }
    @Test
    public void testListSize2(){
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertEquals(0, prueba.size());
    }
    @Test
    public void testListRemove1() throws InformacionInvalida, EmptyListException {
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.remove(56);
        assertEquals(1, prueba.size());
    }
    @Test
    public void testListRemove2() throws InformacionInvalida, EmptyListException {
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        assertThrows(InformacionInvalida.class, () -> {
            prueba.remove(2);
        });
    }
    @Test
    public void testListRemove3() throws InformacionInvalida, PosicionInvalida {
        MyList<Integer> prueba = new LinkedListImpl<>();
        assertThrows(EmptyListException.class, () -> {
            prueba.remove(5);
        });
    }
    @Test
    public void testListRemove4() throws InformacionInvalida, EmptyListException {
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.remove(101);
        assertEquals(1, prueba.size());
    }
    @Test
    public void testListRemove5() throws InformacionInvalida, EmptyListException {
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(5);
        prueba.remove(101);
        assertEquals(2, prueba.size());
    }
    @Test
    public void testListContins1() throws InformacionInvalida{
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(45);
        assertTrue( prueba.contains(101));
    }
    @Test
    public void testListContains2() throws InformacionInvalida{
        MyList<Integer> prueba = new LinkedListImpl<>();
        prueba.add(56);
        prueba.add(101);
        prueba.add(45);
        assertFalse(prueba.contains(3));
    }



//    //------------- Test queue ----------------------------
//    @org.junit.jupiter.api.Test
//    public void test4(){
//        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
//        prueba.enqueue(2);
//        prueba.enqueue(33);
//        prueba.enqueue(754);
//        assertTrue(prueba.contains(33));
//    }
//    @org.junit.jupiter.api.Test
//    public void test5(){
//        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
//        prueba.enqueue(2);
//        prueba.enqueue(33);
//        prueba.enqueue(754);
//        assertEquals(3,prueba.size());
//    }
//    @org.junit.jupiter.api.Test
//    public void test6() throws Exceptions.EmptyQueueException {
//        TADS.MyQueue<Integer> prueba = new TADS.LinkedListImpl<>();
//        prueba.enqueue(2);
//        prueba.enqueue(33);
//        prueba.enqueue(754);
//        assertEquals(2,prueba.dequeue());
//    }


}
