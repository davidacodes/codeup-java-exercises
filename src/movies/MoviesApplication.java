package movies;

import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean quit = false;
        printActions();
        while(!quit) {
            System.out.println("\nEnter your choice: ?");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n Exiting. ");
                    quit = true;
                    break;

                case 1:
                    showAll();
                    break;

                case 2:
                    animatedMovies();
                    break;

                case 3:
                    dramaMovies();
                    break;

                case 4:
                    horrorMovies();
                    break;

                case 5:
                    scifiMovies();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void printActions() {
        System.out.println("\n What would you like to do? ");
        System.out.println("\t 0 - exit");
        System.out.println("\t 1 - view all movies.");
        System.out.println("\t 2 - view movies in the animated category.");
        System.out.println("\t 3 - view movies in the drama category.");
        System.out.println("\t 4 - view movies in the horror category.");
        System.out.println("\t 5 - view movies in the scifi category.");
        System.out.println("\t 6 - view menu.\n");
    }


    private static void showAll() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    private static void animatedMovies() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            if (movie.getCategory() != "animated") {
                continue;
            } else {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    private static void dramaMovies() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            if (movie.getCategory() != "drama") {
                continue;
            } else {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    private static void horrorMovies() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            if (movie.getCategory() != "horror") {
                continue;
            } else {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    private static void scifiMovies() {
        Movie[] allMovies = MoviesArray.findAll();
        for(Movie movie : allMovies) {
            if (movie.getCategory() != "scifi") {
                continue;
            } else {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }






    }

