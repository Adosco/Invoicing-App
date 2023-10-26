package com.tax.product;

public class Company {
    private String companyName;
    private String companyAddress;
    private String termsAndCondition;

    public Company() {
    }

    public Company(String companyName, String companyAddress, String termsAndCondition) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.termsAndCondition = termsAndCondition;
    }

    // Getters and Setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getTermsAndCondition() {
        return termsAndCondition;
    }

    public void setTermsAndCondition(String termsAndCondition) {
        this.termsAndCondition = termsAndCondition;
    }

    public void displayCompanyNameAddress() {
        try {
            System.out.println("\u001B[34mCompany Name:\u001B[0m " + getCompanyName());
            System.out.println("\u001B[34mCompany Address:\u001B[0m  " + getCompanyAddress());

        }catch(Exception e){
            System.out.println("Error occurred!");
        }

    }

}
