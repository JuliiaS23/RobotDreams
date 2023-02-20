package com.ua.robotdreams.lesson11;

public class Main {
    public static void main(String[] args) {
        Car truck = new Truck();
        Car passengerCar = new PassengerCar();
        System.out.println(truck.getCarType());
        System.out.println(passengerCar.getCarType());
    }
}
