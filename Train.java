import java.util.ArrayList;
import java.util.List;

class Train {
    
    private String id;
    private String model;
    private float maxSpeed;
    private int weight;
    private int productionYear;
    private List<Car> cars;
    
    public Train(String id, String model) {
        this(id, model, 0, 0, 0);
    }

    public Train(String id, String model, float maxSpeed, int weight, int productionYear) {
        this.id = id;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.productionYear = productionYear;
        this.cars = new ArrayList<>();
    }
    
    public String addCar(Car car) {
        if (cars.size() >= 200) return "Error: Cannot add more than 200 cars.";
        if (car instanceof SolidCar || car instanceof TempControlCar) {
            for (Car c : cars) {
                if (c instanceof LiquidCar) {
                    return "Error: Dangerous substances must be attached last.";
                }
            }
        }
        cars.add(car);
        return "Car added successfully.";
    
    }
    
    public Car detachCar(String carId) {
        for (Car car : cars) {
            if (car.getId().equals(carId)) {
                cars.remove(car);
                return car;
            }
        }
        return null;
    }
    
     public String loadGoods(double weight, boolean isLiquid, boolean isDangerous, double temp) {
        for (Car car : cars) {
            if (car.loadCargo(weight, isLiquid, isDangerous, temp)) {
                return "Cargo loaded successfully.";
            }
        }
        return "Error: No suitable car found for the cargo.";
    }
}