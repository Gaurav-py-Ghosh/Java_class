public class CARRENTAL {
    long CarId;
    String CarType;

    CARRENTAL(){
        CarId = 54545451215L; 
        CarType = "SUV";
    }

    CARRENTAL(int id, String type){
        CarId = id;
        CarType = type;
    }

    void GetCar(){
        System.out.println("CarId = " + CarId + "\nCarType = " + CarType);
    }

    int GetRent(){
        switch(CarType){
            case "Small Car":
                return 1000;
            case "Van":
                return 800;
            case "SUV":
                return 2500;
            default:
                return 0;  
        }
    }

    public static void main(String[] args) {
        CARRENTAL x = new CARRENTAL();  
        x.GetCar();
        System.out.println("Rent = " + x.GetRent());
    }
}
