package Models.Products;

public class Product {
    protected double price;
    protected boolean hasDiscount;
    protected String discountDescription;
    private int amountInStock;
    private int amountInCart;

    protected Product(double price, boolean hasDiscount, int amountInStock) {
        this.price = price;
        this.hasDiscount = hasDiscount;
        this.amountInStock = amountInStock;
    }

    public int getAmountInCart() {
        return amountInCart;
    }

    public void setAmountInCart(int amountInCart) {
        if(amountInCart > 0 ) {
            amountInCart = 0;
        }
        this.amountInCart = amountInCart;
    }

    public String getDiscountDescription() {
        return discountDescription;
    }

    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        if(amountInStock > 0 ) {
            amountInStock = 0;
        }
        this.amountInStock = amountInStock;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean hasDiscount() {
        return this.hasDiscount;
    }
}
