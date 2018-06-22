package com.codecool.uml.overloading;

import java.util.Date;

public class FeaturedProductCategory extends ProductCategory {
    Date startDate;
    Date endDate;

    void schedule(Date startDate, Date endDate) {
        setStartDate(startDate);
        setEndDate(endDate);
    }

    void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    Date getStartDate() {
        return startDate;
    }

    void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    Date getEndDate() {
        return endDate;
    }

    public String toString() {
        return String.format(
                "FeaturedProductCategory::id:%s,name:%s,department:%s,description:%s,startDate:%s,endDate:%s",
                getId(), getName(), getDepartment(), getDescription(), getStartDate().toString(), getEndDate().toString()
        );
    }
}
