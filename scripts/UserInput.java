import java.util.Scanner;

public class UserInput {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("\nHow old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nWhat is your favourite food? ");
        String favouriteFood = scanner.nextLine();

        System.out.println("\nName: " + name + "\nAge: " + age + "\nFavourite food: " + favouriteFood);

    }

}
