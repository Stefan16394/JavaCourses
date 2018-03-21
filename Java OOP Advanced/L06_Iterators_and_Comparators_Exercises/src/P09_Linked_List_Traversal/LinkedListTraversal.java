package P09_Linked_List_Traversal;

public interface LinkedListTraversal<E> extends Iterable<E> {
    void add(E element);

    boolean remove(E element);

    int getSize();
}