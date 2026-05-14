package com.pluralsight;

public class Vehicle {

        // shared properties for all vehicles
        private String color;
        private int numberOfPassengers;
        private int cargoCapacity;
        private int fuelCapacity;

    // constructor
    public Vehicle(String color, int numberOfPassengers,
                   int cargoCapacity, int fuelCapacity) {

        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

        // getter for color
        public String getColor() {
            return color;
        }

        // setter for color
        public void setColor(String color) {
            this.color = color;
        }

        // getter for passengers
        public int getNumberOfPassengers() {
            return numberOfPassengers;
        }

        // setter for passengers
        public void setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
        }

        // getter for cargo capacity
        public int getCargoCapacity() {
            return cargoCapacity;
        }

        // setter for cargo capacity
        public void setCargoCapacity(int cargoCapacity) {
            this.cargoCapacity = cargoCapacity;
        }

        // getter for fuel capacity
        public int getFuelCapacity() {
            return fuelCapacity;
        }

        // setter for fuel capacity
        public void setFuelCapacity(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }
    }

