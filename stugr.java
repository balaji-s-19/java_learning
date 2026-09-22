import java.util.*;

public class stugr {
    public static void main(String[] args) {
        String name;
        int age;
        double gpa;
        boolean isEnrolled;
        int[] marks = new int[3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your age:");
        age = sc.nextInt();

        System.out.println("Enter your gpa:");
        gpa = sc.nextDouble();

        System.out.println("Enter your enrolled:");
        isEnrolled = sc.nextBoolean();

        System.out.println("Enter your 3 subject marks:");

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }

        double average = total / 3.0;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("gpa " + gpa);
        System.out.println("Enrollment status " + isEnrolled);
        System.out.println("Total marks " + total);
        System.out.println("Average " + average);
        System.out.println("Grade " + grade);
    }
}
