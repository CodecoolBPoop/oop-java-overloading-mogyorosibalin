package com.codecool.uml.overloading;

import java.util.List;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;

public class Product extends Base {
    static int itemCount = 0;

    float defaultPrice;
    Currency defaultCurrency;
    ProductCategory productCategory;
    Supplier supplier;
    static List<Product> productList = new ArrayList<>();

    Product() {
        setId(itemCount++);
        setName("");
        setDefaultPrice(0);
        setDefaultCurrency(Currency.getInstance(Locale.US));
        productList.add(this);
    }

    Product(String name, float defaultPrice, Currency defaultCurrency) {
        setId(itemCount++);
        setName(name);
        setDefaultPrice(defaultPrice);
        setDefaultCurrency(defaultCurrency);
        productList.add(this);
    }

    void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    float getDefaultPrice() {
        return defaultPrice;
    }

    void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    ProductCategory getProductCategory() {
        return productCategory;
    }

    void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    Supplier getSupplier() {
        return supplier;
    }

    static List<Product> getAllProductsBy(ProductCategory productCategory) {
        List<Product> productFiltered = new ArrayList<>();
        for (Product product : productList) {
            if (product.productCategory.getName().equals(productCategory.getName())) {
                productFiltered.add(product);
            }
        }
        return productFiltered;
    }

    static List<Product> getAllProductsBy(Supplier supplier) {
        List<Product> productFiltered = new ArrayList<>();
        for (Product product : productList) {
            if (product.supplier.getName().equals(supplier.getName())) {
                productFiltered.add(product);
            }
        }
        return productFiltered;
    }

    public String toString() {
        return String.format(
            "id:%s,name:%s,defaultPrice:%f,defaultCurrency:%s,productCategory:%s,supplier:%s",
            getId(), getName(), getDefaultPrice(), getDefaultCurrency(), productCategory.getName(), supplier.getName()
        );
    }

}
