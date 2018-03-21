package P01_Generic_Box;

 class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  String.format("%s: %s",value.getClass().getCanonicalName(),value);
    }
}
