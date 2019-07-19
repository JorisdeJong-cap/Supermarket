package Views;

import Models.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductView {

    private List<Product> stock;

    public ProductView(List<Product> stock) {
        this.stock = stock;
    }
    public void showProducts() {
        System.out.println("This is a list of what we currently have in stock:");
        System.out.println("Amount | product");
        for(Product currentProduct : stock) {
            System.out.println(currentProduct.getAmountInStock() + " | " + currentProduct.getClass().getName());
        }
    }
}
