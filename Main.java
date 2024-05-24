import Exceptions.InformacionInvalida;
import Exceptions.PosicionInvalida;
import TADS.MyHashTable;
import TADS.MyHashTableImpl;
public class Main {
    public static void main(String[] args) throws InformacionInvalida {
        MyHashTable<Integer, Integer> prueba = new MyHashTableImpl<>(10);
        prueba.put(3,98);
        prueba.put(8,12);
        prueba.put(20,25);
        prueba.put(55,14);
        prueba.put(74,36);
        prueba.put(1,58);
        prueba.put(2,523);
        prueba.put(4,9);
        prueba.put(67,65);
        System.out.println("---------------------------------------------------");
        prueba.put(7,65);
        prueba.put(98,657);
        prueba.put(100,16);
        prueba.remove(2);
        prueba.put(99,45);
        System.out.println("---------------------------------------------------");
        System.out.println(prueba);
    }
}
