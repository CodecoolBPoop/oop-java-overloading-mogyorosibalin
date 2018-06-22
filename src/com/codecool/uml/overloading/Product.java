package com.codecool.uml.overloading;

import java.util.List;
import java.util.ArrayList;
import java.util.Currency;

public class Product extends Base {
    static int itemCount = 0;

    float defaultPrice;
    Currency defaultCurrency;
    ProductCategory productCategory;
    Supplier supplier;
    List<Product> productList = new ArrayList<>();

}
