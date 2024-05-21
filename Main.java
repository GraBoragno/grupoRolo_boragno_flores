import Exceptions.InformacionInvalida;
import Exceptions.PosicionInvalida;
import TADS.MyHashTable;
import TADS.MyHashTableImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) throws InformacionInvalida {
            MyHashTable<Integer, Integer> prueba = new MyHashTableImpl<>(100);
            prueba.put(3,98);
            prueba.put(8,12);
            prueba.put(20,25);
            prueba.put(55,14);
            prueba.put(74,36);
            prueba.put(1,58);
            System.out.println(prueba.getBucketIndex(3));
            System.out.println(prueba.getBucketIndex(8));
            System.out.println(prueba.getBucketIndex(20));
            System.out.println(prueba.getBucketIndex(55));
            System.out.println(prueba.getBucketIndex(74));
            System.out.println(prueba.getBucketIndex(1));
    }
}
