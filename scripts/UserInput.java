import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {

        // Creating a scanner to allow user input.

        Scanner scanner = new Scanner(System.in);

        // Prompts user for name.
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        // Prompts user for age.
        System.out.println("\nHow old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // Prompts user for their favourite food.
        System.out.println("\nWhat is your favourite food? ");
        String favouriteFood = scanner.nextLine();

        scanner.close();

        System.out.println("\nName: " + name + "\nAge: " + age + "\nFavourite food: " + favouriteFood);

    }

}
