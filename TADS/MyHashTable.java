package TADS;

import Exceptions.InformacionInvalida;

public interface MyHashTable <K, V> {
    public void put (K key, V value) throws InformacionInvalida;
    public boolean contains (K key) throws InformacionInvalida;
    public void remove (K key);
    public int getBucketIndex(K key);
}
