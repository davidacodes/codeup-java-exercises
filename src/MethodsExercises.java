import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(add(3,4));
//        System.out.println(sub(3,4));
//        System.out.println(multiplication(3,4));
//        System.out.println(division(6,2));
//        System.out.println(modulus(6,4));
//        System.out.println(mult(3, 4));
//        System.out.println(multRecursion(3, 4));

        String keepGoing;
        long numb;

        do {
            System.out.print("Factorial - Please pick a number from 1 to 10: ");
            numb = sc.nextLong();
            System.out.format("%s = %d %n", factorString(numb), factorial(numb));
            System.out.print("Would you like to try another? y/n ");
            keepGoing = sc.next();
        } while (keepGoing.equals("y"));


    }

// 1. Basic Arithmetic

    // Addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Substraction
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    // Multiplication
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    // Division
    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    // Modulus
    public static int modulus(int num, int remain) {
        return num % remain;
    }

    // Multiplication with Adding Loop
    public static int mult(int num1, int num2) {
        int result = 0;
        for (int i = 1; i <= num2; i++) {
            result += num1;
        }
        return result;
    }

    // Multiplication with Recursion
    public static double multRecursion(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else if (num2 > 0) {
            return num1 + multRecursion(num1, num2 - 1);
        }
        return -multRecursion(num1, -num2);
    }

// 2. Validate user input is in a certain range.

//    public static int getInteger(int min, int max) {
//
//    }






// 3. Calculate the factorial of anumber.


    public static long factorial(long num) {
        long output = 1;
        for (long i = 1; i < num; i++ ) {
            output = output * i;
        }
        return output;
    }

    public static String factorString(long num) {
        String output = num + "! = ";
        for (long i = 1; i < num; i++) {
            output = output + i + " x ";
        }
        return output + num;
    }






}



