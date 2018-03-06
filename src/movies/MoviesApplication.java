//package movies;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//
//public class MoviesApplication {
//    private static Scanner scanner = new Scanner(System.in);
//    private static Movie[] allMovies = MoviesArray.findAll();
//
//
//    public static void main(String[] args) {
//
//        boolean quit = false;
//        printActions();
//        while(!quit) {
//            System.out.println("\nEnter your choice: ?");
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\n Exiting. ");
//                    quit = true;
//                    break;
//
//                case 1:
//                    showMovies();
//                    break;
//
//                case 2:
//                    showMovies("animated");
//                    break;
//
//                case 3:
//                    showMovies("drama");
//                    break;
//
//                case 4:
//                    showMovies("horror");
//                    break;
//
//                case 5:
//                    showMovies("scifi");
//                    break;
//
//                case 6:
//                    showMovies("musical");
//                    break;
//
//                case 7:
//                    printActions();
//                    break;
//
//                default:
//                    System.out.println("Error: something went wrong.");
//                    break;
//            }
//        }
//    }
//
//    private static void addMovie() {
////        //1. get some input from the user (Title + catrgory)
////        Movie newMovie = new Movie(title, genre)
////        //2. Create a movie object based on the user input
////        Movie newMovie = new Movie(title, genre);
////        //3. "Add" that movie to the movies array
////        //3a. Create a copy of the array with a longer length
////        Movie[] moviesPlus = Arrays.copyOf(movies, movies.length +1)
////        //3b add the new movie to the array
////        int lastIndex = moviesPlus.length - 1;
////        moviesPlus[lastIndex] = newMovie;
////        //3c re-assign the movies property to our new array
////        movies = moviesPlus;
//
//    }
//
//    private static void printActions() {
//        System.out.println("\n What would you like to do? ");
//        System.out.println("\t 0 - exit");
//        System.out.println("\t 1 - view all movies.");
//        System.out.println("\t 2 - view movies in the animated category.");
//        System.out.println("\t 3 - view movies in the drama category.");
//        System.out.println("\t 4 - view movies in the horror category.");
//        System.out.println("\t 5 - view movies in the scifi category.");
//        System.out.println("\t 6 - view movies in the musical category");
//        System.out.println("\t 7 - view menu.\n");
//    }
//
//
//    private static void showMovies() {
//        System.out.format("+-------------------------------------+-----------+\n");
//        for(Movie movie : allMovies) {
//            System.out.format("| %-35s | %-9s |\n", movie.getName(), movie.getCategory());
//            System.out.format("+-------------------------------------+-----------+\n");
//        }
//    }
//
//    private static void showMovies(String category) {
//        System.out.format("+-------------------------------------+-----------+\n");
//        for(Movie movie : allMovies) {
//            if (movie.getCategory().equals(category)) {
//                System.out.format("| %-35s | %-9s |\n", movie.getName(), movie.getCategory());
//                System.out.format("+-------------------------------------+-----------+\n");
//            }
//        }
//    }
//
//
//}
//
