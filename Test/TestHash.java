package Test;
import Exceptions.EmptyListException;
import Exceptions.InformacionInvalida;
import static org.junit.jupiter.api.Assertions.*;
import Exceptions.PosicionInvalida;
import TADS.*;
import org.junit.jupiter.api.Test;

public class TestHash {
    @Test
    public void testPut1() throws InformacionInvalida {
        MyHashTable<Integer, Integer> prueba = new MyHashTableImpl<>(30);
        assertThrows(InformacionInvalida.class, () -> {
            prueba.put(null, 34);
        });
    }

    @Test
    public void testContains1() throws PosicionInvalida, InformacionInvalida{
        MyHashTable<Integer, Integer> prueba = new MyHashTableImpl<>(30);
        prueba.put(3,98);
        assertEquals(prueba.contains(3), true);
    }
    @Test
    public void testListGet1() throws PosicionInvalida, InformacionInvalida{
        MyHashTable<Integer, Integer> prueba = new MyHashTableImpl<>(100);
        prueba.put(3,98);
        prueba.put(8,12);
        prueba.put(20,25);
        prueba.put(55,14);
        prueba.put(74,36);
        prueba.put(1,58);
        System.out.println(prueba);
        assertEquals(prueba.contains(3), true);
    }
}
