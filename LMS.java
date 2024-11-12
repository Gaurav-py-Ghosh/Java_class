import java.util.Scanner;

class book{
    int bookId;
    String title;
    final String author;
    int availableCopies;

    public book(int bookId, String title, String author)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = 1;

    }

    public book(int bookId, String title, String author, int availableCopies)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;

    }

    public  void borrowBook(){
        if(availableCopies > 0){
            availableCopies--;
            System.out.println("Book borrowed successfully , available copies:"+availableCopies);
           
        }
        else{
            System.out.println("No available copies");
        }
        }


    public void view(){
        System.out.println("Book ID:"+this.bookId);
        System.out.println("Author :"+this.author);
        System.out.println("Title:"+this.title);
        System.out.println("Available Copies:"+this.availableCopies);
    }

    }








public class LMS {
    public static void main(String[] args) {
        book[] b = new book[5];
        b[0] = new book(100 , "Title1","Gaurav Ghosh",2) ;
        b[1]= new book(101 , "Title2","Krishna Mundra",3);
        b[2]= new book(102 , "Title3","Laskhay Singhal");
        b[3]= new book(103 , "Title4","Sarang Dev",1);
        b[4]= new book(104 , "Title5","Ayush Gupta",2);

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the book id to borrow or view:");
            int bId = s.nextInt();

   
            System.out.println("For Borrowing a book press 1 for viewing details press 2:");
            int choice = s.nextInt();

            switch (bId) {
                case(100):
                    switch(choice){
                        case(1):
                            b[0].borrowBook();
                        case(2):
                            b[0].view();

                        break;
                case(101):
                        switch(choice){
                            case(1):
                                b[1].borrowBook();
                            case(2):
                                b[1].view();
                            
                        break;
                case(102):
                        switch(choice){
                            case(1):
                                b[2].borrowBook();
                            case(2):
                                b[2].view();
                    
                        break;
            
                
            }

   }
                    }
                }
        }
        }
    }

        

    



