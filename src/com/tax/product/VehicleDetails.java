package com.tax.product;

public class VehicleDetails {
    String make;
    String model;
    String registrationNumber;
    double mileage;

    public VehicleDetails(){

    }
    public VehicleDetails(String make, String model, String registrationNumber,double mileage) {
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    //Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicle(){
        try {
            System.out.println(" \u001B[34mMake:\u001B[0m " + getMake());
            System.out.println(" \u001B[34mModel:\u001B[0m " + getModel());
            System.out.println(" \u001B[34mRegistration No:\u001B[0m " + getRegistrationNumber());

        }catch (Exception e){
            System.out.println("Error occurred!");
        }

    }

    @Override
    public String toString() {
        return "VehicleDetails{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
