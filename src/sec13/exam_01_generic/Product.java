package sec13.exam_01_generic;

public class Product<A, B> {
    private A kind;
    private B model;

    public A getKind() {
        return kind;
    }

    public void setKind(A kind) {
        this.kind = kind;
    }

    public B getModel() {
        return model;
    }

    public void setModel(B model) {
        this.model = model;
    }
}
class  Tv{}
