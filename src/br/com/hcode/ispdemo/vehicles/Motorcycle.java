package br.com.hcode.ispdemo.vehicles;

//O correto a ser feito é criar uma nova interface e implementa-la
public class Motorcycle implements IVehicle, IVehicleMotorcicle {

    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine) {
        configureMotorcycle(color, year, engine);
    }

    //Esse método veio de graças devido a implementação no contrato que é a interface
    //@Override
    //public void configureCar(String color, String year, double engine, int seats) {}

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        System.out.println("Creating a " + color + " color motorcicle with a " + engine + " displacement of year " + year);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Vehicle turn on");
    }
}
