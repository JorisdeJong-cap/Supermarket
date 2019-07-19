package Controllers;

import Models.Products.*;
import Views.ProductView;
import Views.ShoppingCartView;
import Views.SupermarketView;

import java.util.ArrayList;
import java.util.List;

public class SupermarketController {
    private ShoppingCartView cartView;
    private ProductView productView;
    private SupermarketView mainMenu;

    private List<Product> stock = new ArrayList<Product>();


    public void start() {
        fillStock();
        cartView = new ShoppingCartView();
        productView = new ProductView(stock);
        mainMenu = new SupermarketView(this, productView, cartView);
        mainMenu.welcome();
    }

    public void update() {
        switch(mainMenu.continueOrPay()) {
            case 1 : {
                mainMenu.selectProduct();
            }
            case 2 : {
                //mainMenu.goToRegister();
            }
        }
    }

    public void fillStock() {
        stock.add(new Brinta(2.5,false,25));
        stock.add(new Robijn(3,true,40));
        stock.add(new ChineseGroenten(5,false,10));
        stock.add(new Kwark(2,false,50));
        stock.add(new Luiers(10,false,30));
    }

}
