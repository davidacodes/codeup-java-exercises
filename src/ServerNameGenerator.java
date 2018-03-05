import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInst();
            while (!quit) {
                System.out.println("Please make a selection: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayName();
                        break;
                    case 2:
                        quit = true;
                        break;
                }
            }
        }

        private static void printInst () {
            System.out.println("\nPress ");
            System.out.println("\t 1 - Generate server name");
            System.out.println("\t 2 - Quit");
        }

       private static int rand() {
            Random rand = new Random();
            int n = rand.nextInt(9) + 1;
            return n;
        }

        private static void displayName() {
            String[] adjectives = new String[10];
            adjectives[0] = "Agreeable";
            adjectives[1] = "Brave";
            adjectives[2] = "Calm";
            adjectives[3] = "Delightful";
            adjectives[4] = "Eager";
            adjectives[5] = "Faithful";
            adjectives[6] = "Gentle";
            adjectives[7] = "Happy";
            adjectives[8] = "Kind";
            adjectives[9] = "Thankful";

            String[] nouns = new String[10];
            nouns[0] = "Iron Man";
            nouns[1] = "Superman";
            nouns[2] = "Wolverine";
            nouns[3] = "Captain America";
            nouns[4] = "Spiderman";
            nouns[5] = "Batman";
            nouns[6] = "Hulk";
            nouns[7] = "Deadpool";
            nouns[8] = "Daredevil";
            nouns[9] = "Thor";

            System.out.println("Here is your server name:\n" +
                    adjectives[rand()] + "-" + nouns[rand()]);
        }

}