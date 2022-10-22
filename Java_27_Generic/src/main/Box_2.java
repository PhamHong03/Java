package main;

public class Box_2<T> {
//    <>: Generic
    private T value;

    public Box_2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
