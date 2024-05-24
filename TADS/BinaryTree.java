package TADS;
import Exceptions.EmptyTreeException;
import Exceptions.EntidadYaExiste;

import java.util.List;
public interface BinaryTree<T extends Comparable<T>> {

    void add(T oElement) throws EmptyTreeException, EntidadYaExiste;

    void remove(T oElement);

    boolean contains(T oElement) throws EmptyTreeException;

    T find(T oElement) throws EmptyTreeException;

    List<T> preOrder();

    List<T> posOrder();

    List<T> inOrder();

}
