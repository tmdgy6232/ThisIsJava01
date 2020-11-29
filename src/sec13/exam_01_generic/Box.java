package sec13.exam_01_generic;

public class Box<T> {
    private T t;

    public T getObject() {
        return t;
    }

    public void setObject(T object) {
        this.t = object;
    }
}
