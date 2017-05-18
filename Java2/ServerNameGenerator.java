/**
 * Compiliation: javac ServerNameGenerator
 * Execution: java ServerNameGenerator
 *
 * Creates a server name from predefined arrays.
 * Prints the name to user.
 */

import java.util.Random;

public class ServerNameGenerator {

    public final static int stringSize = 10;
    public String[] adjectives;
    public String[] nouns;
    public String name = new String();

    public ServerNameGenerator() {
        this.adjectives = new String[] {
                "great",
                "little",
                "old",
                "different",
                "small",
                "large",
                "early",
                "young",
                "important",
                "bad"
        };
        this.nouns = new String[] {
                "people",
                "history",
                "art",
                "information",
                "family",
                "government",
                "health",
                "computer",
                "meat",
                "music"
        };
        this.name = this.createName(this.adjectives, this.nouns);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        System.out.println("Hello ServerNameGenerator");
        ServerNameGenerator hello = new ServerNameGenerator();
    }

    public String getRandomFromString(String[] list) {
        Random rand = new Random();
        int randomNumber = (int) rand.nextInt(stringSize) + 1;
        return list[randomNumber];
    }

    public String createName(String[] first, String[] second) {
        return getRandomFromString(second) + getRandomFromString(first);
    }
}