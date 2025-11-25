import java.util.Scanner;

public class PROG2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter CGPA: ");
        float cgpa = sc.nextFloat();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.printf("CGPA : %.2f\n", cgpa);  
        System.out.println("Grade : "+ grade);

        sc.close();
    }
}
