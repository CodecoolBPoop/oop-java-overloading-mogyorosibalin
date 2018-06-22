package com.codecool.uml.overloading;

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

    public String toString() {
        return String.format(
            "id:%s,name:%s,description:%s",
            getId(), getName(), getDescription()
        );
    }
}
