
class First{
    public static void main(String[] args) {
        //primitve types
        int a = 5;
        char b = 'a';
        long c = 400;
        double d = 3.2;
    
        //non premitivetype
        String name = "Gaurav";

        addex("Hot dogs");
        

        System.out.println(name.toUpperCase());
        Second sh = new Second();
        String ab = sh.hello(); 
        System.out.println(ab);



        


    }


    public static void addex(String s) {
        System.out.println(s+"!");
        
    } 

    
} 