package com.javaproject;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(15000, 15);
        sedan.calculateSalePrice();
        Sedan sedan1=new Sedan(50000,25);
        sedan1.calculateSalePrice();

        Truck truck=new Truck( 20000,2000);
        truck.calculateSalePrice();
        Truck truck1=new Truck( 35000,3500);
        truck1.calculateSalePrice();
    }
}
