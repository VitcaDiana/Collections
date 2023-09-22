import exercitii.ex10.Category;
import exercitii.ex10.Product;
import exercitii.ex10.Store;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {
    @Test
    void addProduct_ShouldAddCategoryAndProductInStore(){
        //given
        Product product = new Product("lapte",12, Category.LACTATE);
        Store store = new Store();
        //when
        store.addProduct(product);
        //then
        assertTrue(store.getProductsByCategory().containsKey(product.getCategory()));
        assertTrue(store.getProductsByCategory().get(Category.LACTATE).contains(product));
    }
    @Test
    void addProduct_ShouldAddOnlyProductInStore(){
        //given
        Product existingProduct = new Product("lapte",12, Category.LACTATE);
        Product newProduct = new Product("lapte",12, Category.LACTATE);
        List<Product> existingProducts = new ArrayList<>();
        existingProducts.add(existingProduct);
        Store store = new Store();
        store.getProductsByCategory().put(Category.LACTATE,existingProducts );
        //when
        store.addProduct(newProduct);
        //then

        assertTrue(store.getProductsByCategory().get(newProduct.getCategory()).contains(newProduct));
        assertEquals(2,store.getProductsByCategory().get(newProduct.getCategory()).size());
    }
    @Test
    void testGetProductByCategory_ShouldReturnProductsFRomCategory(){
        //given
        Product existingProduct = new Product("lapte",12, Category.LACTATE);
        Product newProduct = new Product("branza",12, Category.LACTATE);
        List<Product> existingProducts = new ArrayList<>();
        existingProducts.add(existingProduct);
        Store store = new Store();
        store.getProductsByCategory().put(Category.LACTATE,existingProducts );
        //when
        List<Product> result = store.getProductsByCategory(Category.LACTATE);
        //then

        assertTrue(result.contains(newProduct));
        assertTrue(result.contains(existingProduct));
        assertEquals(2,result.size());
    }



}
