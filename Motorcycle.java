package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem2;

public class Motorcycle extends Vehicle {

    public Motorcycle(double fuel, double fuelConsumption, double capacity) {
        super(fuel, fuelConsumption, capacity);
    }


    @Override
    public String drive(double distance) {
        return "Motorcycle" + super.drive(distance);
    }

    @Override
    public String toString() {
        return "Motorcycle" + super.toString();
    }
}
