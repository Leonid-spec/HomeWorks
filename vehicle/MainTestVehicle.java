package homeWork_22.vehicle;

public class MainTestVehicle {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Audi"),
                new Bicycle("Loch"),
                new Motorcycle("Death on the road")};
        for (Vehicle vehicle : vehicles){
            vehicle.startEngine();
        }

    }

}
