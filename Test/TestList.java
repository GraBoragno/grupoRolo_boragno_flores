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
    public void testAdd1() {
        MyList<Integer> list = new LinkedListImpl<>();
        assertThrows(InformacionInvalida.class, () -> list.add(null));
    }

    @Test
    public void testAddyGet2() throws InformacionInvalida, PosicionInvalida {
        MyList<Integer> list = new LinkedListImpl<>();
        list.add(357);
        assertEquals(357, list.get(0));
    }
    @Test
    public void testGet3() {
        MyList<Integer> list = new LinkedListImpl<>();
        assertThrows(PosicionInvalida.class, () -> list.get(-5));
        assertThrows(PosicionInvalida.class, () -> list.get(3));
    }

    @Test
    public void testContains1() throws InformacionInvalida {
        MyList<Integer> list = new LinkedListImpl<>();
        list.add(16);
        assertTrue(list.contains(16));
        assertFalse(list.contains(865));
    }

    @Test
    public void testRemove1() throws InformacionInvalida, EmptyListException {
        MyList<Integer> list = new LinkedListImpl<>();
        list.add(63);
        list.remove(63);
        assertFalse(list.contains(63));
    }
    @Test
    public void testRemove2() {
        MyList<Integer> list = new LinkedListImpl<>();
        assertThrows(EmptyListException.class, () -> list.remove(1));
    }
    @Test
    public void testRemove3() throws InformacionInvalida {
        MyList<Integer> list = new LinkedListImpl<>();
        list.add(145);
        assertThrows(InformacionInvalida.class, () -> list.remove(2));
    }
    @Test
    public void testSize1() throws InformacionInvalida, EmptyListException {
        MyList<Integer> list = new LinkedListImpl<>();
        list.add(63);
        list.add(56);
        assertEquals(2,list.size());
    }
}
