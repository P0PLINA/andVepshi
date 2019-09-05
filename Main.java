package HomeW;

public class Main {
    public static void main(String[] args) {
        Engine AutoEngine = new Engine();
        AutoEngine.hybrid = false;
        AutoEngine.engineVol = 1.6;
        AutoEngine.engineHorses = 110;
        AutoEngine.fuelCons = 5.7;

        Avto AutoCar = new Avto();
        AutoCar.brand = "VOLKSWAGEN";
        AutoCar.model = "Polo";
        AutoCar.color = "Silver";
        AutoCar.mileage = 100;
        AutoCar.weight = 1700;
        AutoCar.damaged = false;
        AutoCar.fuel = 55;
        AutoCar.motor = AutoEngine;


        AutoCar.Gudok();
        AutoCar.FuelWaste(AutoCar.mileage, AutoEngine.fuelCons);
        AutoCar.Gudok();
    }
}