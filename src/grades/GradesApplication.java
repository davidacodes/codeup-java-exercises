package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();



        System.out.println((char)27 + "[31m" + "Welcome to the grader tool thingy!");
        students = gitClass();

        for(String key : students.keySet()) {
            System.out.print((char)27 + "[33m" + " |"+ key + "| ");
        }

        boolean quit = false;
            while(!quit) {
                System.out.println("\n" + (char)27 + "[35m" + "What Student would you like to judge based on their grades?");
                String nameInput = scanner.nextLine();

                System.out.println((char)27 + "[34m" + nameInput + " got an average of " + students.get(nameInput).getGradeAverage());
                System.out.print((char)27 + "[33m" + "Would you like to judge another student? y/n");
                String keepGoing = scanner.nextLine();

                if (keepGoing.equals("y")) {
                    quit = false;
                } else {

                    quit = true;
                    System.out.println("\n" + (char)27 + "[35m" + "Goodbye.");
                }

            }
    }

    public static HashMap<String, Student> gitClass() {
        HashMap<String, Student> usernames = new HashMap<>();

        Student username1 = new Student("david");
        usernames.put("davidalex620", username1);
        username1.addGrades(100);
        username1.addGrades(95);
        username1.addGrades(80);
        username1.addGrades(80);
        username1.addGrades(95);

        Student username2 = new Student("Chris");
        usernames.put("ChrisXXX", username2);
        username2.addGrades(90);
        username2.addGrades(80);
        username2.addGrades(75);
        username2.addGrades(60);


        Student username3 = new Student("Emily");
        usernames.put("3mul470r", username3);
        username3.addGrades(70);
        username3.addGrades(80);
        username3.addGrades(80);
        username3.addGrades(90);

        return usernames;

    }



}
