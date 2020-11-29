package sec13.exam_01_generic;

public class ProductExample {
    public static void main(String[] args) {
        Product<Integer, String> product = new Product<>();
        product.setKind(1);
        product.setModel("시니어개발자");
        Integer productKind = product.getKind();
        String productMoel = product.getModel();

        System.out.println(productKind + productMoel);
    }
}
