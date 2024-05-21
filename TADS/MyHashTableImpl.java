package TADS;

import Exceptions.InformacionInvalida;

public class MyHashTableImpl<K,T> implements MyHashTable <K, T>{
    private DoubleNode<K,T>[] buckets; // array de nodos dobles
    private int numBuckets;
    private int ocupados;

    public MyHashTableImpl(int numBuckets) {
        this.numBuckets = numBuckets;
        this.ocupados = 0;
        this.buckets = (DoubleNode<K, T>[]) new DoubleNode[numBuckets];
    }
    public int getBucketIndex(K key) {
        return Math.abs(key.hashCode()) % numBuckets;
    }
    @Override
    public void put(K key, T value) throws InformacionInvalida{
        if (key == null){
            throw new InformacionInvalida();
        }
        int index = getBucketIndex(key);
        DoubleNode <K,T> temp = buckets [index];
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                temp.setValue(value);
                return;
            }
            else{
                index = (index + 1) % buckets.length;
                temp = buckets[index];
            }
        }
        DoubleNode<K, T> newNode = new DoubleNode<>(key, value);
        buckets[index] = newNode;
        ocupados++;
    }

    @Override
    public boolean contains(K key) throws InformacionInvalida {
        if (key == null){
            throw new InformacionInvalida();
        }
        int index = getBucketIndex(key);
        DoubleNode <K,T> temp = buckets [index];
        while(temp != null){
            if (!temp.getKey().equals(key)){
                index++;
                temp = buckets[index];
            } else if (temp.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(K key) {

    }

    public int getOcupados() {
        return ocupados;
    }
}
