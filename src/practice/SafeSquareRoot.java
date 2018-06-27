package practice;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x, y;
        String ready;

        System.out.println("Are you ready? type 'YES!':");
        ready = keyboard.nextLine();

        while (!ready.equals("YES!")) {
            System.out.println("What about now?");
            ready = keyboard.nextLine();
        }

        System.out.println("Give me a number, and I'll find its square root.");
        System.out.println("(No negatives, please.)");
        x = keyboard.nextDouble();

        while (x < 0) {
            System.out.println("I won't take the square root of a negative.");
            System.out.println("\nNew Number: ");
            x = keyboard.nextDouble();
        }

        y = Math.sqrt(x);

        System.out.println("the square root of "+x+" is "+y);
    }
}
