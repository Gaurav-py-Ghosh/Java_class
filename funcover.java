class D {
    String modelName;
    double cost;
    
    public D(String modelName, double cost) {
        this.modelName = modelName;
        this.cost = cost;
    }

    
    public void displayDetails() {
        System.out.println("Model: " + modelName);
        System.out.println("Cost: $" + cost);
    }
}

class laptop extends D {
    int ramSize;
    
    public laptop(String modelName, double cost, int ramSize) {
        super(modelName, cost);
        this.ramSize = ramSize;
    }

    
   @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("RAM Size: " + ramSize + "GB");
    }
}

public class funcover {
    public static void main(String[] args) {
        // Example usage
        laptop myLaptop = new laptop("Dell XPS", 1500.00, 16);
        myLaptop.displayDetails();
    }
}
