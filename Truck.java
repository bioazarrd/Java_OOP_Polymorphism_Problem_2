package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem2;

public class Truck extends Vehicle {
    private static final double AIR_CONDITION_CONSUMPTION = 1.6;

    public Truck(double fuel, double fuelConsumption, int capacity) {
        super(fuel, fuelConsumption + AIR_CONDITION_CONSUMPTION, capacity);
    }




    @Override
    public void refuel(double quantity) {
        super.refuel(quantity * 0.95);
    }

    @Override
    public String drive(double distance) {
        return "Truck" + super.drive(distance);
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }


}
