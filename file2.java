class HomeAppliance {
    String brand;
    int powerRating;

    public HomeAppliance(String brand, int powerRating) {
        this.brand = brand;
        this.powerRating = powerRating;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Rating: " + powerRating + "W");
    }
}

class AirConditioner extends HomeAppliance {
    double currentTemperature;

    public AirConditioner(String brand, int powerRating, double currentTemperature) {
        super(brand, powerRating);
        this.currentTemperature = currentTemperature;
    }

    public void adjustTemperature(double newTemp) {
        if (newTemp >= 16 && newTemp <= 30) {
            currentTemperature = newTemp;
            System.out.println("Temperature set to " + currentTemperature + "°C.");
        } else {
            System.out.println("Invalid temperature setting.");
        }
    }
}

public class file2 {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner("LG", 2200, 24.5);
        ac.displayDetails();
        ac.adjustTemperature(28);
        ac.adjustTemperature(32);
    }
}
