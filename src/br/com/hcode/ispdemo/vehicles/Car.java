package br.com.hcode.ispdemo.vehicles;

//O correto a ser feito é criar uma nova interface e implementa-la
public class Car implements IVehicle, IVehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {

        configureCar(color, year, engine, seats);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Creating a " + color + " color car with a " + engine + " engine of year " + year
                + " and with " + seats + " seats with interface");
        startVehicle();
    }

    //Esse método veio de graças devido a implementação no contrato que é a interface
    //@Override
    //public void configureMotorcycle(String color, String year, double engine) {}

    @Override
    public void startVehicle() {
        System.out.println("Vehicle turn on");
    }
}
