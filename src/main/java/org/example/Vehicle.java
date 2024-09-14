package org.example;

public class Vehicle {

    String name;
    double fuelLevel;
    double mileage;
    double totalTravelDistance;
    double maxSpeed;
    boolean  damaged;
    String color;

    public double accelerate(double speed, double durationInHours) {

      System.out.println(name+ "Is accelerating with" + speed +"Km/h" + durationInHours + "h");
      double distance = speed * durationInHours;
      totalTravelDistance= totalTravelDistance + distance;
      System.out.println("Total Travel Distance for vehicle " + name + ":" + totalTravelDistance);

      double usedFuel= distance * mileage/100;
      fuelLevel -= usedFuel;
      System.out.println("Remaining fuel for vehicle " + name + ":" + fuelLevel);

      return distance;
    }
}
