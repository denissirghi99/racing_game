package org.example;


public class App 
{
public static void main(String [] args)
{
   Car carReference= new Car();
   carReference.name="Ferrari";
   carReference.maxSpeed=300;
   carReference.fuelLevel=60;
   carReference.mileage=12.5;
   carReference.color= "Red";
   carReference.damaged=true;
   carReference.doorCount=2;
   carReference.totalTravelDistance=0;

   System.out.println("Propreties of car" + carReference.name);
   System.out.println("Max speed:" + carReference.maxSpeed);
   System.out.println("Fuel level:"+carReference.fuelLevel);
   System.out.println("Mileage:" +carReference.mileage);
   System.out.println("Color:" +carReference.color);
   System.out.println("Damage:" +carReference.damaged);
   System.out.println("Total travel distance:" + carReference.totalTravelDistance);
   System.out.println("Door count:" +carReference.doorCount);

    Car car2= new Car();
    car2.name="Lamborghini";
    car2.maxSpeed=350;
    car2.fuelLevel=85;
    car2.mileage=12.5;
    car2.color= "Red";
    car2.damaged=true;
    car2.doorCount=2;
    car2.totalTravelDistance=0;

    System.out.println("Propreties of car" + car2.name);
    System.out.println("Max speed:" + car2.maxSpeed);
    System.out.println("Fuel level:"+car2.fuelLevel);
    System.out.println("Mileage:" +car2.mileage);
    System.out.println("Color:" +car2.color);
    System.out.println("Damage:" +car2.damaged);
    System.out.println("Total travel distance:" + car2.totalTravelDistance);
    System.out.println("Door count:" +car2.doorCount);


}
}
