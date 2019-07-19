package Controllers;

import Models.Products.Product;
import Models.ShoppingCart;

public class ShoppingCartController {

    private ShoppingCart cart = new ShoppingCart();
    public void addToCart(Product product, int amount) {
        if(amount > 0) {
            product.setAmountInCart(amount);
            cart.getProductList().add(product);
        }
    }
    public void removeFromCart(Product product, int amount) {
        if(cart.getProductList().contains(product)) {
            return;
        }
        int currentAmountInCart = cart.getProductList().get(cart.getProductList().indexOf(product)).getAmountInCart();

        if(currentAmountInCart - amount <= 0) {
            product.setAmountInCart(0);
            cart.getProductList().remove(product);
        } else {
            cart.getProductList().get(cart.getProductList().indexOf(product)).setAmountInCart(currentAmountInCart - amount);
        }
    }
}
