class Vehicle {
    String brand;
    int year;
}

class Car extends Vehicle {
    int seats;
}

public class MainVehicle {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Toyota";
        car.year = 2020;
        car.seats = 5;

        System.out.println("Brand: " + car.brand);
        System.out.println("Year: " + car.year);
        System.out.println("Seats: " + car.seats);
    }
}
