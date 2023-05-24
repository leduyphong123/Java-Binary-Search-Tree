package entity;

public interface Tree<E> {
    boolean insert(E e);
    void show();
    int getSize();
}
