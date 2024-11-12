import java.util.*;
public class starr {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the Size of Array");
            int n = scanner.nextInt();
            System.out.println("Enter the Names of Students");

            String[] arr = new String[n];

            int[] marks = new int[n];
            scanner.nextLine();//accounts for enter after 3
            for(int i = 0 ; i<n;i++){
                String x = scanner.nextLine();
                arr[i] = x;
            }

            System.out.println("Enter the Marks of Students");
            for(int i = 0 ; i<n;i++){
                int y = scanner.nextInt();
                marks[i] = y;
            }
            int maxIndex;
            maxIndex = 0;
            for(int k = 0 ; k<n;k++){
                if(marks[k] > marks[maxIndex]){
                    maxIndex = k;
                }
            
            char[] Grade = new char[n];
            for(int i = 0 ; i<n;i++){
                int mark = marks[i];
                if( 90 < mark && mark <=100){
                    Grade[i] = 'A';

                }
                else if( 80 <= mark && mark <=90){
                    Grade[i] = 'B';

                }
                else if ( 40 < mark && mark <=70) {
                    Grade[i] = 'C';
                    
                }
                else{
                    Grade[i] = 'F';

                }
                
            
   }
   System.out.println("Student with highest marks is : " + arr[maxIndex] + " with marks : " + marks[maxIndex]);
   System.out.println("Student Grades : ");
   for(int i = 0 ; i<n;i++){
            System.out.println(arr[i] + " : " + Grade[i]);
   }
   
}
        }
}
}