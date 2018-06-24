package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;

public class Webshop {

    private static Currency defaultCurrency = Currency.getInstance("USD");

    public static void main(String[] args) {
        Supplier anonymousSupplier = new Supplier();
        Supplier apple = new Supplier("Apple", "iPhone, Mac, MacBook, iPad");
        Supplier samsung = new Supplier("Samsung", "Galaxy");

        ProductCategory anonymousProductCategory = new ProductCategory();
        ProductCategory phone = new ProductCategory("Smart phone", "Electronics", "Small devices for daily use.");
        ProductCategory notebook = new ProductCategory("Notebook", "Electronics", "Powerful computers for anywhere use.");

        Product iPhoneX = new Product("iPhone X", (float)399.99, defaultCurrency);
        iPhoneX.setSupplier(apple);
        iPhoneX.setProductCategory(phone);
        Product iPhone8 = new Product("iPhone 8", (float)299.99, defaultCurrency);
        iPhone8.setSupplier(apple);
        iPhone8.setProductCategory(phone);
        Product iPhone8Plus = new Product("iPhone 8+", (float)349.99, defaultCurrency);
        iPhone8Plus.setSupplier(apple);
        iPhone8Plus.setProductCategory(phone);

        Product samsungS8 = new Product("Samsung Galaxy S8", (float)249.99, defaultCurrency);
        samsungS8.setSupplier(samsung);
        samsungS8.setProductCategory(phone);
        Product samsungNote4 = new Product();
        samsungNote4.setName("Samsung Note 4");
        samsungNote4.setDefaultPrice((float)299.99);
        samsungNote4.setSupplier(samsung);
        samsungNote4.setProductCategory(phone);

        Product macBookAir13 = new Product();
        macBookAir13.setName("MacBook Air 13");
        macBookAir13.setDefaultPrice((float)399.99);
        macBookAir13.setSupplier(apple);
        macBookAir13.setProductCategory(notebook);
        Product macBookPro13 = new Product("MacBook Pro 13", (float)499.99, defaultCurrency);
        macBookPro13.setSupplier(apple);
        macBookPro13.setProductCategory(notebook);

        System.out.println("***** All products *****");
        for (Product product : Product.productList) {
            System.out.println(product.toString());
        }

        System.out.println("***** Products of Apple *****");
        for (Product product : apple.getProducts()) {
            System.out.println(product.toString());
        }

        System.out.println("***** Smart phones *****");
        for (Product product : phone.getProducts()) {
            System.out.println(product.toString());
        }

    }
}
