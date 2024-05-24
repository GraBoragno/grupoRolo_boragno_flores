package Test;

import Exceptions.*;

import static org.junit.jupiter.api.Assertions.*;

import TADS.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class TestBinaryTree {

    @Test
    public void testAdd() throws EmptyTreeException, EntidadYaExiste {
        BinaryTree<Integer> prueba = new SearchBinaryTreeImpl<>();
        prueba.add(15);
        assertThrows(EntidadYaExiste.class, () -> {
            prueba.add(15);
        });
    }
    @Test
    public void testRemove() throws EmptyTreeException, EntidadYaExiste {
        BinaryTree<Integer> prueba = new SearchBinaryTreeImpl<>();
        prueba.add(15);
        prueba.add(25);
        prueba.add(18);
        prueba.remove(25);
        assertFalse(prueba.contains(25));
    }
    @Test
    public void testContains() throws EmptyTreeException {
        BinaryTree<Integer> prueba = new SearchBinaryTreeImpl<>();
        assertThrows(EmptyTreeException.class, () -> {
            prueba.contains(15);
        });
    }
    @Test
    public void testFind1() throws EmptyTreeException, EntidadYaExiste {
        BinaryTree<Integer> prueba = new SearchBinaryTreeImpl<>();
        prueba.add(10);
        assertEquals(10,(int)prueba.find(10));
    }
    @Test
    public void testFind2() throws EmptyTreeException{
        BinaryTree<Integer> prueba = new SearchBinaryTreeImpl<>();
        assertThrows(EmptyTreeException.class, () -> {
            prueba.find(15);
        });
    }
    @Test
    public void testPreOrder() throws EmptyTreeException, EntidadYaExiste {
        BinaryTree<Integer> prueba = new SearchBinaryTreeImpl<>();
        prueba.add(20);
        prueba.add(15);
        prueba.add(25);
        prueba.add(18);
        prueba.add(10);
        prueba.add(23);
        prueba.add(30);
        assertEquals("[20, 15, 10, 18, 25, 23, 30]",prueba.preOrder().toString());
    }
    @Test
    public void testPosOrder() throws EmptyTreeException, EntidadYaExiste {
        BinaryTree<Integer> prueba = new SearchBinaryTreeImpl<>();
        prueba.add(20);
        prueba.add(15);
        prueba.add(25);
        prueba.add(18);
        prueba.add(10);
        prueba.add(23);
        prueba.add(30);
        assertEquals("[15, 10, 18, 25, 23, 30, 20]",prueba.posOrder().toString());

    }
    @Test
    public void testInOrder() throws EmptyTreeException, EntidadYaExiste {
        BinaryTree<Integer> prueba = new SearchBinaryTreeImpl<>();
        prueba.add(20);
        prueba.add(15);
        prueba.add(25);
        prueba.add(18);
        prueba.add(10);
        prueba.add(23);
        prueba.add(30);
        assertEquals("[10, 15, 18, 20, 23, 25, 30]",prueba.inOrder().toString());
    }
}
