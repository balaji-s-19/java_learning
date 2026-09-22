import java.util.*;
public class Main {
    public static void main(String[]args){
        String name;
        int age;
        double gpa;
        boolean isEnrolled;
        int[] marks=new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        System.out.println("Enter your gpa:");
        gpa = sc.nextDouble();
                System.out.println("Enter your enrolled:");

        isEnrolled=sc.nextBoolean();
        System.out.println("enter your mark:");
        

        for(int i=0;i<=marks.length;i++){
            marks[i] = sc.nextInt();
            System.out.println(marks[i]);
        }  
        System.out.println("name"+name); 
        System.out.println("age"+age);
        System.out.println("gpa"+gpa); 
        System.out.println("Enrollment status"+ isEnrolled);   
    }
}