package Models;

import Models.Products.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    public List<Product> getProductList() {
        return productList;
    }

    private List<Product> productList = new ArrayList<Product>();
}
