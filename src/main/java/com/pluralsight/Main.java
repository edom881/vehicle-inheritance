package com.pluralsight;

public class Main {


        public static void main(String[] args) {

            Moped slowRide = new Moped("Red", 1, 1, 5);
            Car familyCar = new Car("Blue", 5, 4, 15);
            SemiTruck bigTruck = new SemiTruck("Black", 2, 5000, 100);
            Hovercraft futureRide = new Hovercraft("Silver", 6, 10, 20);

            System.out.println("Moped Color: " + slowRide.getColor());
            System.out.println("Moped Fuel Capacity: " + slowRide.getFuelCapacity());

            System.out.println("Car Color: " + familyCar.getColor());
            System.out.println("Car Passengers: " + familyCar.getNumberOfPassengers());

            System.out.println("Semi Truck Cargo Capacity: " + bigTruck.getCargoCapacity());

            System.out.println("Hovercraft Color: " + futureRide.getColor());
        }




        }


