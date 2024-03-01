package br.com.hcode.ocpdemo;

import br.com.hcode.ocpdemo.vehicles.Car;
import br.com.hcode.ocpdemo.vehicles.Motorcycle;

public class Main {

    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;

        if (typeVehicle.equals(TypeVehicle.CAR)){
            Car car = new Car("red", "2015", 1.8, 4);
        } else if (typeVehicle.equals(TypeVehicle.MOTORCYCLE)){
            Motorcycle motorcycle = new Motorcycle("blue", "2015", 250);
            motorcycle.configureMotorcycle();
        }
    }
}
