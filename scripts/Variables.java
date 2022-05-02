public class Variables {
    
    public static void main(String[] args) {

        // Initialising small integer
        byte smallInt = 2;
        // Initialising large integer
        short largeInt = 32000;
        // Initialising the product of two the integers
        int productInts = smallInt * largeInt;
        // Outputs the integers and their product
        System.out.println("First integer: " + smallInt + "\nSecond integer: " + largeInt +
         "\nProduct of integers: " + productInts + "\n");


        // Experimenting with data types
        long hugeInt = 37580943589L;
        System.out.println("Here is a huge integer: " + hugeInt);

        float decimalNum = 7.4532f;
        System.out.println("Here is a decimal number: " + decimalNum);

        double decimalNum2 = 5.634534523423;
        System.out.println("Here is a decimal number with more digits: " + decimalNum2);

        boolean trueValue = true;
        System.out.println("Here is a boolean value (true/false): " + trueValue);
        
        String myName = "Yenula De Alwis";
        System.out.println("\nHello, my name is " + myName);

        // Swapping variable values
        byte int1 = 23;
        byte int2 = 21;
        byte temp;

        System.out.println("Integer 1: " + int1);
        System.out.println("Integer 2: " + int2);
        
        temp = int1;
        int1 = int2;
        int2 = temp;

        System.out.println("\nThe integers have swapped.");
        System.out.println("Integer 1: " + int1);
        System.out.println("Integer 2: " + int2);

    }

}
