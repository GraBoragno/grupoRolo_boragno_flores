public interface MyList<T> {

    void add(T value);

    T get(int position) throws PosicionInvalida;

    boolean contains(T value);

    void remove(T value) throws InformacionInvalida, EmptyListException;

    int size();

}
