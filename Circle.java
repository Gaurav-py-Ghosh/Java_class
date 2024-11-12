public class Circle {
    float radius;

    Circle() {
        radius = 0;
    }

    Circle(float r) {
        radius = r;
    }

    float getRadius() {
        return radius;
    }

    float getArea(){
        return 3.141592653589793f * radius * radius;
    }

    float getCircumference(){
        return 2 * 3.141592653589793f * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(14);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
        Circle d = new Circle();
        System.out.println("Radius: " + d.getRadius());
        


    }
    
}
