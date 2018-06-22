package com.codecool.uml.overloading;

import java.util.List;

public class ProductCategory extends Base {
    static int productCategoryCount = 0;

    String department;

    ProductCategory() {
        setId(productCategoryCount++);
        setName("");
        setDepartment("");
        setDescription("");
    }

    ProductCategory(String name, String department, String description) {
        setId(productCategoryCount++);
        setName(name);
        setDepartment(department);
        setDescription(description);
    }

    void setDepartment(String department) {
        this.department = department;
    }

    String getDepartment() {
        return department;
    }

    List<Product> getProducts() {
        return Product.getAllProductsBy(this);
    }

    public String toString() {
        return String.format(
                "id:%s,name:%s,department:%s,description:%s",
                getId(), getName(), getDepartment(), getDescription()
        );
    }
}
