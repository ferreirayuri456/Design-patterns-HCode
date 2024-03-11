package br.com.hcode.ispdemo;

import br.com.hcode.ispdemo.vehicles.Car;
import br.com.hcode.ispdemo.vehicles.Motorcycle;

public class Main {

    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.MOTORCYCLE;

        if (typeVehicle.equals(TypeVehicle.CAR)){
            Car car = new Car("red", "2015", 1.8, 4);
        } else if (typeVehicle.equals(TypeVehicle.MOTORCYCLE)){
            Motorcycle motorcycle = new Motorcycle("blue", "2015", 250);
        }
    }
}
