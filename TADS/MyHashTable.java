package TADS;

import Exceptions.InformacionInvalida;

public interface MyHashTable <K, V> {
    public void put (K key, V value);
    public boolean contains (K key) throws InformacionInvalida;
    public void removeHash (K key);
}
