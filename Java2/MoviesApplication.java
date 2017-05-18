/**
 * Compiliation: javac MoviesApplication.java
 * Execution: java MoviesApplication
 *
 * User interface for filtering a list of movies by category.
 */

public class MoviesApplication {
    public static void main(String[] args) {
        Input userInput = new Input();
        MoviesApplication mApplication = new MoviesApplication();
        MoviesArray movies = new MoviesArray();
        int answer = 1;

        System.out.println("What would you like to do? ");
        do {
            System.out.printf("0 - exit" +
                    "\n1 - View all movies" +
                    "\n2 - View movies in the animated category" +
                    "\n3 - View movies in the drama category" +
                    "\n4 - View movies in the horror category" +
                    "\n5 - View movies in the scifi category" +
                    "\n");
            System.out.printf("Enter your choice: ");
            answer = userInput.getInt(0, 5);
            Movie[] moviesArray = movies.findAll();

            if (answer == 1) {
                mApplication.filterMovies(moviesArray);
            } else if (answer == 0) {
                System.exit(0);
            } else {
                mApplication.filterMovies(moviesArray, mApplication.getCategoryName(answer));
            }
        } while (answer > 0);

        /* TODO: add functionality for user to add a movie */
    }

    public void filterMovies(Movie[] movies) {
        for (Movie movie : movies) {
            movie.printMovie(movie);
        }
    }

    public void filterMovies(Movie[] movies, String category) {
        for (Movie movie : movies) {
            if (movie.category.equals(category)) {
                movie.printMovie(movie);
            }
        }
    }

    public String getCategoryName(int answer) {
        String name = "";
        switch(answer) {
            case 2:
                name = "animated";
                break;
            case 3:
                name = "drama";
                break;
            case 4:
                name = "horror";
                break;
            case 5:
                name = "scifi";
                break;
            default:
        }
        return name;
    }
}