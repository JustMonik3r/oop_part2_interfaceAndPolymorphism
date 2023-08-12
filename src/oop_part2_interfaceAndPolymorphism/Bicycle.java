package oop_part2_interfaceAndPolymorphism;

public class Bicycle extends TwoWheeledVehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void replaceTyre() {
        System.out.println("Меняем покрышку");
    }
}
