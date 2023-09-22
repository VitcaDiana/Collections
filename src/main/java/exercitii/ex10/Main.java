package exercitii.ex10;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("carnat",20,Category.MEZELURI);
        Store store = new Store();
        store.addProduct(product);
        Product product2 = new Product("muschi",20,Category.MEZELURI);
        store.addProduct(product2);
        store.deleteProduct(product2);
        System.out.println(store.getProductsByCategory(Category.MEZELURI));
        System.out.println(store.getAllCategories());
    }
}
