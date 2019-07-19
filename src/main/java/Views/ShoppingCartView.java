package Views;

import Models.Products.Product;
import Models.ShoppingCart;

public class ShoppingCartView {
    public void showCartContents(ShoppingCart cart) {
        System.out.println("This is a list of what you currently have in your shopping cart:");
        System.out.println("Amount | product");
        for(Product currentProduct : cart.getProductList()) {
            System.out.println(currentProduct.getAmountInCart() + " | " + currentProduct.getClass().getName());
        }
    }
}
