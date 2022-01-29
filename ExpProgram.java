
//Justin Nguyen
import java.util.Scanner;

public class ExpProgram {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number");
        int first = keyboard.nextInt();
        System.out.println("Enter a second number");
        int second = keyboard.nextInt();

        int remainder = first % second; // calculates divison and returns remainder

        if (remainder == 0) { // if the first int is evenly divisible by the second int

            System.out.println(first + " is evenly divisible by " + second + "cool");
        } else // if the first int is not evenly divisible by the second int
            System.out.println(
                    first + " is not evenly divisible by " + second + " , the remainer is " + remainder
                            + "AWESOMEEEEE");

        keyboard.close();
    } // end main
} // end class