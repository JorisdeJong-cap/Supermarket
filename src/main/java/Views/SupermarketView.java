package Views;

public class SupermarketView {

    public void welcome() {
        System.out.println("Welcome to Generic Supermarket! \n How can we help you?");
        System.out.println("These are the products we currently have in stock:");
        ProductView products = new ProductView();
        //products.showProducts();


    }
}
