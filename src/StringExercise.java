import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  1. String Basics
        String pink = "We don't need no education\n" + "We don't need no thought control";
        System.out.println(pink);

        String copyPaste = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(copyPaste);

        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);

        String slashes = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(slashes);


//  2. Create Bob the AI without intelligence.

        String input;
        String stop;

        System.out.print("Hey, I'm Bob");
        do {
            System.out.println(" what do you want?");
            input = sc.nextLine();
            if (input.toLowerCase().equals("bob") || input.trim().equals("")) {
            System.out.println("Fine. Be that way!");
            } else if (input.toUpperCase().equals(input) || input.endsWith("!")) {
                System.out.println("Whoa, Chill out!");
            } else if (input.endsWith("?")) {
                System.out.println("Sure");
            } else {
                System.out.println("Whatever.");
            }
            System.out.print("Do you ask any thing else? y/n: ");
            stop = sc.next();
            sc.nextLine();
        } while (stop.equals("y"));
    }
}


