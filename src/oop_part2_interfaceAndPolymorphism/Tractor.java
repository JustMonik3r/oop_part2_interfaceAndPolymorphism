package oop_part2_interfaceAndPolymorphism;

public class Tractor extends TrackVehicle{
    public Tractor(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void doService() {
        super.doService();
        super.repairTrack();
        weldBucket();
    }

    public void weldBucket() {
        System.out.println("Завариваем ковш трактора");
    }
}
