package com.tax.product;

import java.util.ArrayList;

public class Customers {
    private String customerName;
    double customerBalance;

    static ArrayList<String> customers = new ArrayList<>();

    // Non-Parameterized constructor
    public Customers() {
    }

    // Parameterized constructor
    public Customers(String customerName) {
        this.customerName = customerName;
        customers.add(customerName);
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<String> getCustomerList() {
        return customers;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerName='" + customerName + '\'' +
                ", customerBalance=" + customerBalance +
                '}';
    }
}
