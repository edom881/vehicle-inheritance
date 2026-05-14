package com.pluralsight;

public class Main {


        public static void main(String[] args) {

            // create a moped object
            Moped slowRide = new Moped();

            // use inherited setters
            slowRide.setColor("Red");
            slowRide.setFuelCapacity(5);
            slowRide.setNumberOfPassengers(1);
            slowRide.setCargoCapacity(1);

            // print values using inherited getters
            System.out.println("Moped Color: " + slowRide.getColor());
            System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());



            // create a car object
            Car familyCar = new Car();

            familyCar.setColor("Blue");
            familyCar.setFuelCapacity(15);
            familyCar.setNumberOfPassengers(5);
            familyCar.setCargoCapacity(4);

            System.out.println("Car Color: " + familyCar.getColor());
            System.out.println("Passengers: " + familyCar.getNumberOfPassengers());



            // create a semi truck object
            SemiTruck bigTruck = new SemiTruck();

            bigTruck.setColor("Black");
            bigTruck.setFuelCapacity(100);
            bigTruck.setNumberOfPassengers(2);
            bigTruck.setCargoCapacity(5000);

            System.out.println("Truck Cargo Capacity: " + bigTruck.getCargoCapacity());



            // create a hovercraft object
            Hovercraft futureRide = new Hovercraft();

            futureRide.setColor("Silver");
            futureRide.setFuelCapacity(20);
            futureRide.setNumberOfPassengers(6);
            futureRide.setCargoCapacity(10);

            System.out.println("Hovercraft Color: " + futureRide.getColor());
        }
    }

