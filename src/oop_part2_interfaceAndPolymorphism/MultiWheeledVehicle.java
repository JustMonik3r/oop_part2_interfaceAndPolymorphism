package oop_part2_interfaceAndPolymorphism;

public class MultiWheeledVehicle extends Vehicle {
    public MultiWheeledVehicle (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем " + this.getModelName());
        replaceWheel();
    }

    public void replaceWheel() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем колесо");
        }
    }
}
