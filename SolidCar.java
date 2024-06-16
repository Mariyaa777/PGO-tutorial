class SolidCar implements Car {
    private String id;
    private double capacity;
    private double maxCargoWeight;
    private double currentCargoWeight;

    public SolidCar(String id, double capacity, double maxCargoWeight) {
        this.id = id;
        this.capacity = capacity;
        this.maxCargoWeight = maxCargoWeight;
        this.currentCargoWeight = 0;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public double getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public boolean loadCargo(double weight, boolean isLiquid, boolean isDangerous, double temp) {
        if (isLiquid || isDangerous || temp < 0 || temp > 5 || currentCargoWeight + weight > maxCargoWeight) {
            return false;
        }
        currentCargoWeight += weight;
        return true;
    }
}