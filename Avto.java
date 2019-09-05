package HomeW;

public class Avto {
    public String brand;
    public String model;
    public String color;
    public double mileage;
    public int weight;
    public boolean damaged;
    public int fuel;
    Engine motor;

    public void Gudok(){
        System.out.println("Пубидупибубибиииииб!");
    }

    public void FuelWaste(double mileage, double fuelCons){
        System.out.println("Расход бенза: " + mileage*fuelCons + " л");
    }
}
