import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//// 1. Loop Basics a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(" " + i);
//            i++;
//        }

//          for (int i = 100; i >= -10; i -= 5) {
//              System.out.println(i);
//          }
//
//
// 1. Loop Basics b. Do While
//        long num = 2;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1000000);
//
//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }
//
//
//
//// 1. Loop Basics c. For
//
//
//
//// 2. Fizzbuzz
//
//        int numb = 1;
//        while (numb < 101) {
//            if (numb % 15 == 0) {
//                System.out.println("Fizzbuzz");
//                num++;
//            }
//            if (numb % 5 == 0) {
//                System.out.println("Buzz");
//                num++;
//            }
//            if (numb % 3 == 0) {
//                System.out.println("Fizz");
//                numb++;
//            } else {
//                System.out.println(numb);
//                numb++;
//            }
//        }

//  3. Display a table of powers.

        int number;
        String keepGoing = "y";
        do {
            System.out.print("What number would you like to go up to?");
            number = 1 + sc.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            String leftAlignFormat = "| %-6d | %-8d | %-6d |%n";
            System.out.format("+--------+----------+--------+%n");
            System.out.format("| Number | Squared  | Cubed  |%n");
            System.out.format("+--------+----------+--------+%n");
            for (int i = 1; i < number; i++) {
                System.out.format(leftAlignFormat, i, i * i, i * i * i );
            }
            System.out.format("+--------+----------+--------+%n");
            System.out.println();
            System.out.print("Would you like to continue? y/n");
            keepGoing = sc.next();
        } while (keepGoing.equals("y"));




// 4. Convert given number grades into letter grades

//        int grade;
//        String stop = "y";
//
//        do {
//            System.out.print("Please input the grade: ");
//            grade = sc.nextInt();
//            if (grade >= 88) {
//                System.out.println("Got an A.");
//            }
//            if ((grade >= 80) && (grade <= 87)) {
//                System.out.println("Got a B.");
//            }
//            if ((grade >= 67) && (grade <= 79)) {
//                System.out.println("Got a C.");
//            }
//            if ((grade >= 60) && (grade <= 66)) {
//                System.out.println("Got a D.");
//            }
//            if ((grade >= 0) && (grade <= 59)) {
//                System.out.println("Got a F.");
//            }
//
//            System.out.print("Do you have another grade? y/n: ");
//            stop = sc.next();
//        } while (stop.equals("y"));









    }
}
