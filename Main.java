package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Vehicle> vehicleByType = new LinkedHashMap<>();

        String[] input = reader.readLine().split("\\s+");
        vehicleByType.put("Car", new Car(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));


        input = reader.readLine().split("\\s+");
        vehicleByType.put("Truck", new Truck(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));


        input = reader.readLine().split("\\s+");
        vehicleByType.put("Bus", new Bus(Double.parseDouble(input[1]),
                Double.parseDouble(input[2]),
                Integer.parseInt(input[3])));


        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            double param = Double.parseDouble(tokens[2]);
            String type = tokens[1];
            String command = tokens[0];


            if (command.equals("Drive") && type.equals("Bus")) {
                // grozen nachin cast-vane za da raboti .driveEmpty() - zashtoto Vehicle nqma metod driveEmpty();
                System.out.println(((Bus) vehicleByType.get("Bus")).driveWithPassengers(param));
            } else if (command.contains("Drive")) {
                System.out.println(vehicleByType.get(type).drive(param));
            } else if (command.equals("Refuel")) {
                try {
                    vehicleByType.get(type).refuel(param);
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                }
            }
        }



        for (Vehicle vehicle : vehicleByType.values()) {
            System.out.println(vehicle.toString());
        }
    }
}