import java.util.*;
public class Student {
    String name;
    static String universityName ;


    void set( String name, String universityName ) {
        this.name = name;
        this.universityName = universityName;
    }
    
    static String getUniversity() {
        return universityName;
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.set("John Doe", "Stanford University");
        
        s2.set("Gaurav","BML University");
   
        System.out.println(Student.getUniversity());
        System.out.println(Student.getUniversity());


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].set("Student " + (i+1), "Default University");
        }
        for (Student student : students) {
            System.out.println(student.name + " : " + Student.universityName);
        }
}
}