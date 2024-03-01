package br.com.hcode.ocpdemo.vehicles;

public class Motorcycle extends Vehicle{

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
    }

    public void configureMotorcycle(){
        System.out.println("Creating a " + color + " color motorcycle with a " + engine + " engine of year " + year);
        startVehicle();
    }
}
