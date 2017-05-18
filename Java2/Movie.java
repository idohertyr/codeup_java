public class Movie {
    private String name;
    public String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static void main(String[] args) {
        /* Hello Movie */
    }

    public void printMovie(Movie movie) {
        System.out.printf("Movie: %s Category: %s\n", movie.name, movie.category);
    }
}