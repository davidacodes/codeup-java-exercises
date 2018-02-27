import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userInput;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        userInput = sc.nextInt();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        String oneInput, twoInput, threeInput;

        System.out.print("Enter one word: ");
        oneInput = sc.next();


        System.out.print("Enter another word: ");
        twoInput = sc.next();


        System.out.print("Enter one last word: ");
        threeInput = sc.next();
        sc.nextLine();

        System.out.println(oneInput);
        System.out.println(twoInput);
        System.out.println(threeInput);


        String userString;

        System.out.print("Could you enter a string: ");
        userString = sc.nextLine();

        System.out.println(userString);

        double length;
        double width;
        double area;
        double perimeter;

        System.out.println("Lets find the area and perimeter.");
        System.out.println("What's the length?");
        length = sc.nextDouble();
        System.out.println("What's the width?");
        width = sc.nextDouble();

        area = length * width;
        perimeter = (length * 2) + (width + 2);

        System.out.println("The area is: " + area + "The perimeter: " + perimeter);

    }
}
