public class Expressions {

    public static void main(String[] args) {

        double number = 12;
        // Displaying the initial value of the variable - number.
        System.out.println("Here is the initial value of number:\t" + number);

        // Number is incremented by 1.
        number = number + 1;
        System.out.println("\nHere is the new value of number:\t" + number);

        // Number is multiplied by 2.
        number = number * 2;
        System.out.println("\nHere is the new value of number:\t" + number);

        // Number is divided by 3.
        number = number / 3;
        System.out.println("\nHere is the new value of number:\t" + number);

        // Number is subtracted from 10
        number = 10 - number;
        System.out.println("\nHere is the new value of number:\t" + number);

        // Number is now the remainder of number divided by 3
        number = number % 3;
        System.out.println("\nHere is the final value of number:\t" + number);

    }

}
