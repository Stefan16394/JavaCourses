package P10_Tuple;

 class Tuple<T,S> {
    private T item1;
    private S item2;

    public Tuple(T name,S place) {
        this.item1=name;
        this.item2=place;
    }

    public Object getItem1() {
        return item1;
    }

    public Object getItem2() {
        return item2;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public void setItem2(S item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return this.item1+" -> "+this.item2;
    }
}
