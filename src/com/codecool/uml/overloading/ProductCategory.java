package com.codecool.uml.overloading;

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
}
