import Exceptions.EmptyListException;
import Exceptions.InformacionInvalida;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestStack {

    @Test
    public void testPush1() throws InformacionInvalida{
        MyStack<Integer> prueba = new LinkedListImpl<>();
        prueba.push(2);
        prueba.push(5);
        prueba.push(23);
        assertEquals(3, prueba.size());
    }
    @Test
    public void testPush2() throws InformacionInvalida{
        MyStack<Integer> prueba = new LinkedListImpl<>();
        assertThrows(InformacionInvalida.class, () -> {
            prueba.push(null);
        });
    }
    @Test
    public void testPop1() throws EmptyStackException, InformacionInvalida{
        MyStack<Integer> prueba = new LinkedListImpl<>();
        prueba.push(2);
        prueba.push(5);
        prueba.push(7);
        assertEquals(7, prueba.pop());
    }
    @Test
    public void testPop2() throws InformacionInvalida, EmptyStackException {
        MyStack<Integer> prueba = new LinkedListImpl<>();
        assertThrows(EmptyStackException.class, () -> {
            prueba.pop();
        });
    }
    @Test
    public void testTop1() throws InformacionInvalida {
        MyStack<Integer> prueba = new LinkedListImpl<>();
        prueba.push(2);
        prueba.push(5);
        prueba.push(23);
        assertEquals(23, prueba.top());
    }
    @Test
    public void testTop2() throws InformacionInvalida {
        MyStack<Integer> prueba = new LinkedListImpl<>();
        assertNull(prueba.top());
    }
}