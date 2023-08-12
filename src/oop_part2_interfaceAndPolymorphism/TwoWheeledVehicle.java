package oop_part2_interfaceAndPolymorphism;

public class TwoWheeledVehicle extends Vehicle {
    public TwoWheeledVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем " + this.getModelName());
        replaceTyre();
    }

    public void replaceTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
