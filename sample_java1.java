import java.util.Scanner;

public class Module_1A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 13) {
            
            System.out.println("Child - Serve Water");
        } else if (age <= 19) {
        
            System.out.println("Teenager - Serve Badam Milk");
        } else {
            
            System.out.println("Adult - Serve Coke");
        }

        sc.close();
    }
}
