public class sept12 {
    class Book{
        String title;
        String author;
        int year;
        double price;
        Book(String title, String author, int yr, double price){
            this.title = title;
            this.author = author;
            year = yr;
            this.price = price;
        }
    }
    public static void main(String[] args) {
        sept12 s = new sept12();
        Book b1,b2,b3;
        b1 = s.new Book("Java Programming", "Schildt", 1998, 25.99);
        b2 = s.new Book("C++ Programming", "Bjarne Stroustrup", 1998, 39.99);
        b3 = s.new Book("Flutter Programming", "Fl", 1998, 23.2);
        System.out.println(b1.title + " by " + b1.author + " costs $" + b1.price);
System.out.println(b2.title + " by " + b2.author + " costs $" + b2.price);
System.out.println(b3.title + " by " + b3.author + " costs $" + b3.price);

    }
    
}
