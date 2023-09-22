package exercitii.ex18;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> cartItems;

    public ShoppingCart() {
        this.cartItems = new HashMap<>();
    }

    public Map<Product, Integer> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Map<Product, Integer> cartItems) {
        this.cartItems = cartItems;
    }

    public void addProduct(Product product, Integer quantity) {
        if (cartItems.containsKey(product)) {
            cartItems.put(product, cartItems.get(product) + quantity);
        } else {
            cartItems.put(product, quantity);
        }
    }

    public void addproduct(Product product) {

    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
        return totalPrice;
    }

    public void removeFromCart(Product product, Integer quantity) {
        if (cartItems.containsKey(product)) {
            if (quantity >= cartItems.get(product)) {
                cartItems.remove(product);
            } else {
                cartItems.put(product, cartItems.get(product) - quantity);
            }
        }
    }

    public void removeFromCrat(Product product) {

        cartItems.remove(product);
    }
}
