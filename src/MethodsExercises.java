import java.util.Scanner;
import java.util.Random;


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


        int x = 5 * 4 % 3;
        System.out.println(x);




//  3. Calculate the factorial of a number
        String keepGoing;
        long numb;
        int num;
        int guess;

        do {
            System.out.print("Factorial - Please pick a number from 1 to 10: ");
            numb = sc.nextLong();
            System.out.format("%s = %d %n", factorString(numb), factorial(numb));
            System.out.print("Would you like to try another? y/n ");
            keepGoing = sc.next();
        } while (keepGoing.equals("y"));

//  4. Create an application that simulates dice rolling
        do {
            System.out.print("Roll the dice? y/n ");
            keepGoing = sc.next();
            if ( keepGoing.equals("y")) {
                System.out.println("Total is: " + rollDice(2, 6));
            }
        } while (keepGoing.equals("y"));

//  5. Game Development 101

        num = oneTo100();
        do {
            System.out.println("Try to guess the number between 1 and 100: ");
            guess = sc.nextInt();
            keepGoing = lowHigh(num, guess);
            System.out.println(keepGoing);
        } while (keepGoing.equals("LOWER") || keepGoing.equals("HIGHER"));




    }







// 1. Basic Arithmetic

//        // Addition
//        public static int add ( int num1, int num2){
//            return num1 + num2;
//        }
//
//        // Substraction
//        public static int sub ( int num1, int num2){
//            return num1 - num2;
//        }
//
//        // Multiplication
//        public static int multiplication ( int num1, int num2){
//            return num1 * num2;
//        }
//
//        // Division
//        public static int division ( int num1, int num2){
//            return num1 / num2;
//        }
//
//        // Modulus
//        public static int modulus ( int num, int remain){
//            return num % remain;
//        }
//
//        // Multiplication with Adding Loop
//        public static int mult ( int num1, int num2){
//            int result = 0;
//            for (int i = 1; i <= num2; i++) {
//                result += num1;
//            }
//            return result;
//        }
//
//        // Multiplication with Recursion
//        public static double multRecursion ( double num1, double num2){
//            if (num1 == 0 || num2 == 0) {
//                return 0;
//            } else if (num2 > 0) {
//                return num1 + multRecursion(num1, num2 - 1);
//            }
//            return -multRecursion(num1, -num2);
//        }

// 2. Validate user input is in a certain range.

//    public static int getInteger(int min, int max) {
//
//    }


// 3. Calculate the factorial of anumber.

// Finds the factorial.
        public static long factorial ( long num){
            long output = 1;
            for (long i = 1; i < num; i++) {
                output = output * i;
            }
            return output;
        }


//    Creates the String with all the numbers in the factorial
//    i.e. 4! = 1 x 2 x 3 x 4
        public static String factorString ( long num){
            String output = num + "! = ";
            for (long i = 1; i < num; i++) {
                output = output + i + " x ";
            }
            return output + num;
        }


//    Application that simulates dice rolling.

        public static int rollDice(int number, int nSides) {
            int num = 0;
            int roll = 0;
            Random r = new Random();
            for (int i = 0; i < number; i++) {
                roll = r.nextInt(nSides) + 1;
                System.out.format("Roll %d is: %d %n", i + 1, roll);
                num = num + roll;
            }
            return num;
        }

//    Give a number between 1 and 100

        public static int oneTo100() {
            int num = 0;
            Random r = new Random();
            num = r.nextInt(100) + 1;
            return num;
        }

//    compare to see if num2 is higher or lower to num1
        public static String lowHigh(int num, int guess) {
            String relpy;
            if (num == guess) {
                relpy = "GOOD GUESS!";
            } else if (num > guess) {
                relpy = "HIGHER";
            } else {
                relpy = "LOWER";
            }
            return relpy;
        }





    }












