package Models.Products;

public class Product {
    protected double price = 0;
    protected boolean hasDiscount = false;

    Product(double price, boolean hasDiscount) {
        this.price = price;
        this.hasDiscount = hasDiscount;
    }
    public double getPrice() {
        return this.price;
    }

    public boolean isHasDiscount() {
        return this.hasDiscount;
    }
}
