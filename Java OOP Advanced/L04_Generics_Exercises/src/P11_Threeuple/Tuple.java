package P11_Threeuple;

public class Tuple<T,S,E> {
    private T item1;
    private S item2;
    private E item3;

    public Tuple(T name,S place,E third) {
        this.item1=name;
        this.item2=place;
        this.item3=third;
    }

    public T getItem1() {
        return item1;
    }

    public S getItem2() {
        return item2;
    }

    public E getItem3() {
        return item3;
    }

    @Override
    public String toString() {

        return this.item1+" -> "+this.item2+" -> "+this.item3;

    }
}
