package br.com.hcode.ocpdemo.vehicles;

public class Car implements IVehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        configureVehivcle(color, year, engine, seats);
    }

    @Override
    public void configureVehivcle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Creating a " + color + " color car with a " + engine + " engine of year " + year
                + " and with " + seats + " seats with interface");
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Vehicle turn on");
    }

    /**
     * Na primeira forma de fazer o OCP pode ser utilizado a extensão, sem ser a interface.
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public void configureCar(){
        System.out.println("Creating a " + color + " color car with a " + engine + " engine of year " + year
                + " and with " + seats + " seats");
        startVehicle();
    }
     */

}
