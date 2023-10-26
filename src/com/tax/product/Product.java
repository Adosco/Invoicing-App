package com.tax.product;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Product implements Tax {
    private String descriptionOfService;
    private int quantity;
    private double unitPrice;
    private double amount;
    public static double subTotal = 0.00;
    public static double totalAmount = 0.00;
    private double taxableValue;

    // Levies
    static double covidLevy = 0.01;
    static double nhiLevy = 0.025;
    static double vat = 0.15;
    static double getFundLevy = 0.025;
    List<List<String>> prodList = new ArrayList<>();

    // Constructors of this class
    public Product() {
    }

    public Product(String descriptionOfService, int quantity, double unitPrice) {
        this.descriptionOfService = descriptionOfService;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        subTotal = subTotal + this.getAmount(); // Accumulate the total amount of all the product created
    }

    // Getters and Setters of this class
    public double getTotalAmount() {
        totalAmount = getTaxableValue() + getVAT();
        return totalAmount;
    }

    public double getAmount() {
        amount = quantity * unitPrice;
        return amount;
    }

    public double getTaxableValue() {
        taxableValue = getCovidLevy() + getNHILevy() + getGetFundLevy() + subTotal;
        return taxableValue;
    }

    // Getters and Setters Methods from Tax interface class
    @Override
    public double getCovidLevy() {
        return subTotal * covidLevy;
    }

    @Override
    public double getGetFundLevy() {
        return subTotal * getFundLevy;
    }

    @Override
    public double getNHILevy() {
        return subTotal * nhiLevy;
    }

    @Override
    public double getVAT() {
        return getTaxableValue() * vat;
    }

    @Override
    public void setCovidLevy(double rate) {
        covidLevy = (rate / 100);
    }

    @Override
    public void setGetFundLevy(double rate) {
        getFundLevy = (rate / 100);
    }

    @Override
    public void setNHILevy(double rate) {
        nhiLevy = (rate / 100);
    }

    @Override
    public void setVAT(double rate) {
        vat = (rate / 100);
    }

    @Override
    public void getGroupLevies() {
        System.out.println("\u001B[34mCovid-19 Levy:\u001B[0m " + getCovidLevy());
        System.out.println("\u001B[34mGetFund Levy:\u001B[0m " + getGetFundLevy());
        System.out.println("\u001B[34mNHI Levy:\u001B[0m " + getNHILevy());
    }

    public void displayProdList() {
        // Products details
        List<String> productDetails = new ArrayList<>();
        productDetails.add(getDescriptionOfService());
        productDetails.add(String.valueOf(getQuantity()));
        productDetails.add(String.valueOf(getUnitPrice()));
        productDetails.add(String.valueOf(getAmount()));
        prodList.add(productDetails);



        // Print product details
        for (List<String> details : prodList) {
            System.out.println("|");

            System.out.printf("%-15s %-13s %-11s %-15s %n", details.get(0), details.get(1), details.get(2), details.get(3));
        }
    }

    // Getters and setters for the Product class

    public String getDescriptionOfService() {
        return descriptionOfService;
    }

    public void setDescriptionOfService(String descriptionOfService) {
        this.descriptionOfService = descriptionOfService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + getDescriptionOfService() + '\'' + '\n' +
                ", productQty=" + getQuantity() + '\n' +
                ", unitPrice=" + getUnitPrice() + '\n' +
                ", Subtotal=" + subTotal + '\n' +
                ", Covid Levy=" + getCovidLevy() + '\n' +
                ", Get Fund Levy=" + getGetFundLevy() + '\n' +
                ", NHI Levy=" + getNHILevy() + '\n' +
                ", Taxable Value=" + getTaxableValue() + '\n' +
                ", VAT=" + getVAT() + '\n' +
                ", Total Amount=" + getTotalAmount() + '\n' +
                '}';
    }
}
