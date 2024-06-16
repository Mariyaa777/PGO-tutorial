interface Car {
    String getId();
    double getCapacity();
    double getMaxCargoWeight();
    boolean loadCargo(double weight, boolean isLiquid, boolean isDangerous, double temp);
}