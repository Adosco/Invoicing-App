package com.tax.product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Company company = new Company();
        Customers customer = new Customers();
        VehicleDetails vehicleDetails = new VehicleDetails();
        Product prod = new  Product();


        Scanner sc = new Scanner(System.in);

        int invoiceNumber;
        String preparedBy;
        LocalDate invoiceDate = LocalDate.now();

        System.out.println("Welcome to Invoicing Application");

        do {
            System.out.println("\u001B[31m 1.\u001B[0m \u001B[32m Create Product \u001B[0m ");
            System.out.println("\u001B[31m 2.\u001B[0m \u001B[32m Create Company\u001B[0m");
            System.out.println("\u001B[31m 3.\u001B[0m \u001B[32m Create Customer\u001B[0m");
            System.out.println("\u001B[31m 4.\u001B[0m \u001B[32m Create Vehicle Details\u001B[0m");
            System.out.println("\u001B[31m 5.\u001B[0m \u001B[32m Show Invoice\u001B[0m");
            System.out.println("\u001B[31m 6.\u001B[0m \u001B[32m Exit\u001B[0m");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter service description:");
                    String description = sc.nextLine();
                    System.out.println("Enter service quantity:");
                    int quantity = sc.nextInt();
                    System.out.println("Enter service unit price:");
                    double unitPrice = sc.nextDouble();
                    prod = new  Product(description, quantity, unitPrice);
                    productList.add(prod);

                    break;

                case 2:
                    System.out.println("Enter Company Name:");
                    company.setCompanyName(sc.nextLine());
                    System.out.println("Enter Company Address:");
                    company.setCompanyAddress(sc.nextLine());
                    System.out.println("Enter Company Terms And Condition:");
                    company.setTermsAndCondition(sc.nextLine());
                    break;

                case 3:
                    System.out.println("Enter Customer name:");
                    customer.setCustomerName(sc.nextLine());
                    break;

                case 4:
                    System.out.println("Enter vehicle make:");
                    String make = sc.nextLine();
                    System.out.println("Enter vehicle model:");
                    String model = sc.nextLine();
                    System.out.println("Enter vehicle registration number:");
                    String registrationNumber = sc.nextLine();
                    System.out.println("Enter vehicle mileage: ");
                    double mileage = sc.nextDouble();
                    vehicleDetails = new VehicleDetails(make, model, registrationNumber, mileage);
                    break;


                case 5:
                    System.out.println("Enter invoice number:");
                    invoiceNumber = sc.nextInt();
                    sc.nextLine(); // Consume the newline character
                    System.out.println("Invoice prepared by:");
                    preparedBy = sc.nextLine();
                    System.out.println("\u001B[32m=========INVOICE======================\u001B[0m \n");
                    company.displayCompanyNameAddress();

                    System.out.println("\u001B[32m--------------------------------------\u001B[0m");
                    System.out.println("\u001B[34m Bill To: \u001B[0m" + customer.getCustomerName());
                    vehicleDetails.displayVehicle();
                    System.out.println("\u001B[32m--------------------------------------\u001B[0m\n");

                    System.out.println("\u001B[34m Invoice Date:\u001B[0m " + invoiceDate);
                    System.out.println("\u001B[34m Prepared By: \u001B[0m" + preparedBy);
                    System.out.println("\u001B[34m Invoice number:\u001B[0m " + invoiceNumber + "\n");

                    System.out.printf("%-15s %-13s %-11s %-15s %n", "Description", "Quantity", "Unit Price", "Amount");


                    for (Product product : new ArrayList<>(productList)) {
                        System.out.println("\u001B[31m---------------------------------------------------\u001B[0m");
                        product.displayProdList();



                    }
                    System.out.println("\u001B[31m---------------------------------------------------\u001B[0m\n");
                    System.out.println("\u001B[31mSubTotal:\u001B[0m " + Product.subTotal +"\n");
                    prod.getGroupLevies();
                    System.out.println("\u001B[31mTaxable Value:\u001B[0m " + prod.getTaxableValue() + "\n");
                    System.out.println("\u001B[34mVAT:\u001B[0m " + prod.getVAT() + "\n");
                    System.out.println("\u001B[32m===============================\u001B[0m");
                    System.out.println("\u001B[31mTotal Amount:\u001B[0m " + prod.getTotalAmount());
                    System.out.println("\u001B[32m===============================\u001B[0m\n");


                    break;

                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a valid choice.");
            }

        } while (true);
    }
}
