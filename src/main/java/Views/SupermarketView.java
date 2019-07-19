package Views;

import Controllers.SupermarketController;

import java.util.Scanner;

public class SupermarketView {
    private SupermarketController controller;
    private ProductView productView;
    private ShoppingCartView cartView;
    private Scanner inputScanner = new Scanner(System.in);
    private int result;

    public SupermarketView(SupermarketController controller, ProductView productView, ShoppingCartView cartView) {
        this.controller = controller;
        this.productView = productView;
        this.cartView = cartView;
    }

    public int getResult() {
        return result;
    }

    public void welcome() {
        System.out.println("Welcome to Generic Supermarket! \n How can we help you?");
        selectProduct();

    }

    public void selectProduct() {
        productView.showProducts();
        System.out.println("Which item do you want to add to your cart? please specify a number:");
        String input = inputScanner.nextLine();
        result = checkInput(input);
        controller.update();
    }

    public int checkInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Your input was not a number, please try again:");
            String newInput = inputScanner.nextLine();
            return checkInput(newInput);
        }
    }

    public int continueOrPay() {
        System.out.println("would you like to continue shopping or go to the register?");
        System.out.println("1. continue shopping.");
        System.out.println("2. go to the register.");
        String input = inputScanner.nextLine();
        return checkInput(input);
    }
}
