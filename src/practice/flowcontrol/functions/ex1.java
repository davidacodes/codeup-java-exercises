package practice.flowcontrol.functions;

import java.util.Scanner;

public class ex1 {

    public static double convertFahrToCelc(double fahr) {
        return 5 * (fahr - 32) / 9;
    }

    public static double convertFahrToCelc(double ... fahr) {
        int numberOfNumbers = fahr.length;
        double [] results = new double[numberOfNumbers];
        for (int idx = 0; idx < numberOfNumbers; idx++) {
            results[idx] = convertFahrToCelc(fahr[idx]);
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double f = Double.valueOf(input);
        double c = 5 * (f - 32) / 9;
        System.out.println("the temperature " + f + "f is " + c + "degress celcius");
    }
}

