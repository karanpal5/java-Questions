import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            while (!sc.hasNextInt()) {
                System.out.print("Please enter an integer:" );
                sc.next();
            }
            nums[i] = sc.nextInt();
        }
        System.out.println("You entered:");
        for (int n : nums) System.out.print(n+" ");
        System.out.println();

        Set<Integer> unique = new LinkedHashSet<>();
        for (int n : nums) unique.add(n);

        System.out.println("Unique numbers (duplicates removed):");
        for (int n : unique) System.out.print(n + " ");
        System.out.println();

        sc.close();

    }

    
}
