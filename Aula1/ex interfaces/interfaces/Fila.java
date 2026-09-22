package interfaces;

public interface Fila<T> {
    public abstract void add(T valor);
    public abstract T remove();
    //public abstract T get(int index);
    public abstract boolean isEmpty();
    void mostra();
    

    // add(valor: Integer): void
    // remove(): Integer
    // get(index: int): Integer
    // isEmpy(): boolean
  
}
