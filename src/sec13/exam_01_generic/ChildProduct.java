package sec13.exam_01_generic;

public class ChildProduct<A, B, C> extends Product<A, B> {
    private C company;

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }
}
