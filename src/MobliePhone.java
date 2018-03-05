import java.util.Scanner;

public class MobliePhone {

//    private static Scanner scanner = new Scanner(System.in);
//    private static Phone phone = new Phone("210 501 9610");
//
//
//    public static void main(String[] args) {
//
//
//        // Create a program that implements a simple mobile phone with the following capabilites.
//        // Able to store, modify, remove and query contact names.
//        // You will want to create a separate class for Contacts (name and phone number).
//        // Create a master class (MobilePhone) that holds the arraylist of Contacts
//        // the mobilePhone class has the functionality listed above.
//        // add a menu of options that are available.
//        // Options: Ouit, print list of contacts, add new contact, update existing contact, remove contact
//        // and search/find contact.
//        // When adding or updateing be sure to check if the contact already exists (use name)
//        // Be sure not to expose the inner working of the Arraylist to MobilePhone
//        // e.g. no ints, no .get(i) etc
//        // MobilePhone should do everything with contact objects only.
//
//        boolean quit = false;
//        startPhone();
//        printActions();
//        while(!quit) {
//            System.out.println("\nEnter action: (6 to show avaiable actions)");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\n Shutting down...");
//                    quit = true;
//                    break;
//
//                case 1:
//                    phone.printContact();
//                    break;
//
//                case 2:
//                    addNewContact();
//                    break;
//
//                case 3:
//                    updateContact();
//                    break;
//
//                case 4:
//                    removeContact();
//                    break;
//
//                case 5:
//                    queryContact();
//                    break;
//
//                case 6:
//                    printActions();
//                    break;
//            }
//        }
//    }
//
//    private static void addNewContact()
//
//
//    private static void startPhone(){
//        System.out.println("Starting phone...");
//    }
//
//    private static void printActions() {
//        System.out.println("\nAvailable actions: \npress");
//        System.out.println( "0 - to shutdown\n + " +
//                            "1 - to print contacts\n" +
//                            "2 - to add a new contact\n" +
//                            "3 - to update existing an existing contact\n" +
//                            "4 - to remove an existing contact\n" +
//                            "5 - query if an existing contact exists\n" +
//                            "6 - to print a list available actions.\n");
//        System.out.println("Choose your action: ");
//    }
}
