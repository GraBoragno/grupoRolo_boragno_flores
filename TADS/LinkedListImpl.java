package TADS;

import Exceptions.EmptyListException;
import Exceptions.EmptyQueueException;
import Exceptions.InformacionInvalida;
import Exceptions.PosicionInvalida;

import java.util.EmptyStackException;

public class LinkedListImpl<T> implements MyList<T>, MyQueue<T>, MyStack<T>, MyHashTable<T, T>{

    private MyNode<T> first;

    private MyNode<T> last;

    public LinkedListImpl() {
        this.first = null;
        this.last = null;
    }

    // agrega al final. la hago como una subrutina porque la voy a usar muchas veces
    public void addEnd(T value) throws InformacionInvalida {
        MyNode<T> temp = new MyNode<>(value);
        if (value != null){
            if (this.first == null){
                this.first = temp;
            }else {
                this.last.setNext(temp);
            }
            this.last = temp; // para no repetir la linea la pongo aparte (es parte del else y el if)
        }else {
            throw new InformacionInvalida();
        }
    }

    @Override
    public void add(T value) throws InformacionInvalida{
        addEnd(value);
    }

    //el size tmb sirve para el stack y la queue
    @Override
    public int size() {
        int Resultado = 0;
        MyNode<T> temp = this.first;
        while(temp != null){
            temp = temp.getNext();
            Resultado ++;
        }
        return Resultado;
    }

    @Override
    public T get(int position) throws PosicionInvalida {
        if (position < 0 || position >= size()){
            throw new PosicionInvalida();
        } //no pongo el else porque igual si tira la exception ya corta la funcion

        MyNode<T> temp = this.first;
        int temp2 = 0;
        while (temp.getNext() != null && position != temp2){
            temp = temp.getNext();
            temp2 ++;
        }
        return temp.getValue();
    }

    // tmb sirve para la queue
    @Override
    public boolean contains(T value) {
        MyNode<T> temp = this.first;
        while (temp != null) {
            if (temp.getValue().equals(value)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    @Override
    public void remove(T value) throws InformacionInvalida, EmptyListException {
        if (first == null){
            throw new EmptyListException();
        }else{
            if (!contains(value)){
                throw new InformacionInvalida();
            }
            if (first.getValue().equals(value)){
                first = first.getNext();//si el primero es el que quiero eliminar, hago que el primero sea el segund
                if (first == null){
                    last = null;
                }
            }else{
                MyNode<T> anteriorTemp = null; //preciso saber quien es el anteior para poder eliminar el siguiente
                MyNode<T> temp = first;
                while (temp != null && !temp.getValue().equals(value)){
                    anteriorTemp = temp;
                    temp = temp.getNext();
                }
                anteriorTemp.setNext(temp.getNext());
                temp.setNext(null);
            }
        }

    }

    @Override
    public void push(T value) throws InformacionInvalida{
        addEnd(value);
    }

    @Override
    public T pop() throws EmptyStackException {
        if (first == null)  {
            throw new EmptyStackException();
        }
        T valueToRemove;
        if (first.getNext() == null){
            valueToRemove = first.getValue();
            first = null;
            last = null;
        }
        else{
            MyNode<T> temp = first;
            while (temp.getNext() != last){
                temp = temp.getNext();
            }
            valueToRemove = last.getValue();
            temp.setNext(null);
            last = temp;
        }
        return valueToRemove;
    }

    @Override
    public T top() {
        if (last == null){
            return null;
        }else{
            return last.getValue();
        }
    }

    @Override
    public void enqueue(T value) throws InformacionInvalida{
        MyNode<T> temp = new MyNode<>(value);
        if (value != null){
            if (this.first == null){
                first = temp;
                last = temp;
            }else {
                temp.setNext(first);
                first = temp;
            }
        }else {
            throw new InformacionInvalida();
        }
    }

    @Override
    public T dequeue() throws EmptyQueueException {
        if (first == null){
            throw new EmptyQueueException();
        }
        T valueToRemove = first.getValue();
        if (first.getNext() == null){
            first = null;
            last = null;
        }
        else{
            first = first.getNext();
        }
        return valueToRemove;
    }

    @Override
    public void put(T key, T value) {

    }

    @Override
    public void removeHash(T key) {

    }
}