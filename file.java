class Device {
    String modelName;
    double cost;

    public Device(String modelName, double cost) {
        this.modelName = modelName;
        this.cost = cost;
    }

    public void displayDetails() {
        System.out.println("Device Model: " + modelName);
        System.out.println("Cost: $" + cost);
    }
}

class Laptop extends Device {
    int ramSize;

    public Laptop(String modelName, double cost, int ramSize) {
        super(modelName, cost);
        this.ramSize = ramSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

public class file {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("MacBook Pro", 1500.99, 16);
        myLaptop.displayDetails();
    }
}
