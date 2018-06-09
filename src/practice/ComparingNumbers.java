package practice;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double first, second;

        System.out.println( "Give me two numbers. First: ");
        first = keyboard.nextDouble();
        System.out.println( "Second: ");
        second = keyboard.nextDouble();

        if ( first < second ) {
            System.out.println( first + " is LESS THEN " + second );
        }
        if ( first <= second ) {
            System.out.println( first + " is LESS THAN/EQUAL TO " + second );
        }
        if ( first == second) {
            System.out.println( first + " is EQUAL TO " + second );
        }
        if (first >= second) {
            System.out.println( first + "is GREATER THAN/EQUAL TO " + second);
        }
        if ( first > second ) {
            System.out.println( first + "is Greater then " + second);
        }
        if ( first != second )
            System.out.println( first + " is Not equal to " + second);
    }
}
