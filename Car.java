class Car{
    String companyName;
    String modelName;
    int kms;
    String color;
    Car(String CN, String MN, int k, String clr){
        companyName = CN;
        modelName = MN;
        kms = k;
        color = clr;


    }
    Car(String CN, String MN, String clr){
        companyName = CN;
        modelName = MN;
        kms = 0;
        color = clr;


    }

    void paint(String newclr){
        color = newclr;

    }
    void drive(int newk){
        kms = kms+ newk;

    }
    public static void main(String[] args) {
        Car c = new Car("Alto", "XV", "White");
        Car d = new Car("Alto", "XV",23, "White");
        c.paint("Red");
        d.drive(100);
        System.out.println(c.color+" "+c.kms);
        System.out.println(d.kms);
    }

}

