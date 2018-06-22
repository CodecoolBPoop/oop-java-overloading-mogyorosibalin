package com.codecool.uml.overloading;

import java.util.List;

public class Supplier extends Base {
    static int supplierCount = 0;

    Supplier() {
        setId(supplierCount++);
        setName("");
        setDescription("");
    }

    Supplier(String name, String description) {
        setId(supplierCount++);
        setName(name);
        setDescription(description);
    }

    List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    public String toString() {
        return String.format(
            "id:%s,name:%s,description:%s",
            getId(), getName(), getDescription()
        );
    }
}
