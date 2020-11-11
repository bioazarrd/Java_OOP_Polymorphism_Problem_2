package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem2;
public class Bus extends Vehicle {

    public Bus(double fuel, double fuelConsumption, double capacity) {
        super(fuel, fuelConsumption, capacity);
    }



    @Override
    public String drive(double distance) {
        return "Bus" + super.drive(distance);
    }


    public String driveWithPassengers(double distance) {
        super.increaseConsumption();
        return this.drive(distance);
    }


    @Override
    public String toString() {
        return "Bus" + super.toString();
    }

}
