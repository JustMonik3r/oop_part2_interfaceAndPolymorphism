package oop_part2_interfaceAndPolymorphism;

public abstract class Vehicle implements Service {
    private String modelName;
    private int wheelsCount;

    public String getModelName() {
        return modelName;
    }


    public int getWheelsCount() {
        return wheelsCount;
    }


    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
}
