package com.javaproject;
/*
    Task3
        Create  a  Class  Car  that  would  have  the following  fields:
        carPrice  and  color  and method calculateSalePrice() which should
        be returning a price of the car.Create 2 sub classes: Sedan and Truck.
        The Truck  class  has  field  as  weight  and  has  its own implementation
        of  calculateSalePrice() method in which returned price calculated as following:
        if weight>2000 then returned price car should include 10% discount, otherwise
        20% discount. The Sedan class has field as length and also does it is own
        implementation of calculateSalePrice(): if length of sedan is >20 feet then
        returned car price should include 5% discount, otherwise 10% discount
 */
public abstract class Car {
    double carPrice;
    String color;

    abstract void calculateSalePrice();
}
class Sedan extends Car{
    double length;

    Sedan(double carPrice, double length) {
        this.carPrice=carPrice;
        this.length=length;
    }
@Override
    void calculateSalePrice(){
        double discount;
        if(length>20){
            discount=0.05;                                       //0.05))
        }else{
            discount=0.1;
        }
    System.out.println("The Sedan with a length of "+length+" feet will get " +
            "a discount of "+(discount*100)+"%. Final price is: "+ String.format("%.2f",(carPrice-(carPrice*discount))));
    }

}
class Truck extends Car {
    double weight;


    Truck(double carPrice, double weight) {
        this.carPrice=carPrice;
        this.weight = weight;
    }

    void calculateSalePrice() {
        double discount;
        if (weight > 2000) {
             discount=0.1;
        } else {
            discount=0.2;
        }
        System.out.println("The Truck with a weight of "+weight+" lb will get " +
                "a discount of "+(discount*100)+"%. Final price is: "+ String.format("%.2f",(carPrice-(carPrice*discount))));
    }
}
