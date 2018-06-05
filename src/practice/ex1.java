package practice;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int x = 99;
        long y = x + 32;

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double f = Double.valueOf(input);
        double c = 5 * (f - 32) / 9;
        System.out.println("the temperature " + f + "f is " + c + "degress celcius");
    }
}
