package sec13.exam_01_generic;

public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("SmartTv");
        product.setCompany("Apple");

        Storage<Tv> storage = new StorageImpl<>(100);
        storage.add(new Tv(), 0);
        Tv tv = storage.get(0);
        
    }
}
