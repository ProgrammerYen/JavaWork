import java.lang.Math;
import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the side length of x (in cm):");
        float x = scanner.nextInt();
        scanner.nextLine();

       System.out.println("\nEnter the side length of y (in cm): ");
       float y = scanner.nextInt();
       scanner.nextLine();
       
       double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
       System.out.println("\nThe hypotenuse of the triangle would be " + hypotenuse + ".");

    }

}
