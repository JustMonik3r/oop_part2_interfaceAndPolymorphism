package oop_part2_interfaceAndPolymorphism;

public class TrackVehicle extends Vehicle {
    public TrackVehicle (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем " + this.getModelName());
        repairTrack();
    }

    public void repairTrack() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Чиним гусеницу");
        }
    }
}
