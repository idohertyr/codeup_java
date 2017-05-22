/**
 * Compiliation: javac GradesApplication.java
 * Execution: java GradesApplication
 *
 * Creates a hashmap of Github usernames and Student objects.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;

public class GradesApplication {

    private ArrayList<String> usernames;
    private String[] firstnames;
    private String[] adjectives;

    public GradesApplication() {
        this.usernames = new ArrayList<String>();
        this.firstnames = new String[] {
                "Raymonde",
                "Ronald",
                "Micha",
                "Anitra",
                "Yee",
                "Owen",
                "Claretta",
                "Louisa",
                "Joette",
                "Milda",
                "Laure",
                "Joaquin",
                "Susanna",
                "Aletha",
                "Cheryl",
                "Tora",
                "Vasiliki",
                "Velma",
                "Isis",
                "Cathleen",
                "Valeri",
                "Leanna",
                "Tiffanie",
                "Dylan",
                "Jonathon",
                "Charis",
                "Ghislaine",
                "Kylie",
                "Damian",
                "Garth",
                "Rubie",
                "Gwendolyn",
                "Brett",
                "Javier",
                "Aline",
                "Jackqueline",
                "Vernetta",
                "Edra",
                "Leanora",
                "Branden",
                "Jeannine",
                "Rodrick",
                "Arnulfo",
                "Jeanett",
                "Jeremy",
                "Claire",
                "Tereasa",
                "Nestor",
                "Yuonne",
                "Demetrice"
        };
        this.adjectives = new String[] {
                "complex",
                "complicated",
                "composed",
                "concerned",
                "concrete",
                "confused",
                "conscious",
                "considerate",
                "constant",
                "content",
                "conventional",
                "cooked",
                "cool",
                "cooperative",
                "decent",
                "decimal",
                "decisive",
                "deep",
                "defenseless",
                "defensive",
                "defiant",
                "deficient",
                "definite",
                "definitive",
                "delayed",
                "delectable",
                "delicious",
                "delightful",
                "delirious",
                "demanding",
                "dense",
                "dental",
                "dependable",
                "dependent",
                "descriptive",
                "deserted",
                "detailed",
                "determined",
                "devoted",
                "different",
                "difficult",
                "digital",
                "diligent",
                "dim",
                "dimpled",
                "dimwitted",
                "direct",
                "disastrous",
                "discrete",
                "disfigured",
                "disgusting",
                "disloyal",
                "dismal",
                "distant",
                "downright",
                "dreary",
                "dirty",
                "disguised",
                "dishonest",
                "dismal",
                "distant",
                "distinct",
                "distorted",
                "dizzy",
                "dopey",
                "doting",
                "double",
                "downright",
                "drab",
                "drafty",
                "dramatic",
                "dreary",
                "droopy",
                "dry",
                "dual",
                "dull",
                "dutiful",
                "each",
                "eager",
                "earnest",
                "early",
                "easy",
                "easy-going",
                "ecstatic",
                "edible",
                "educated",
                "elaborate",
                "elastic",
                "elated",
                "elderly",
                "electric",
                "elegant",
                "elementary",
                "elliptical",
                "embarrassed",
                "embellished",
                "eminent",
                "emotional",
                "empty",
                "enchanted",
                "enchanting",
                "energetic",
                "enlightened",
                "enormous",
                "enraged",
                "entire",
                "envious",
                "equal",
                "equatorial",
                "essential",
                "esteemed",
                "ethical",
                "euphoric",
                "even",
                "evergreen",
                "everlasting",
                "every",
                "evil",
                "exalted",
                "excellent",
                "exemplary",
                "exhausted",
                "excitable",
                "excited",
                "exciting",
                "exotic",
                "expensive",
                "experienced",
                "expert",
                "extraneous",
                "extroverted",
                "extra-large",
                "extra-small",
                "fabulous",
                "failing",
                "faint",
                "fair",
                "faithful",
                "fake",
                "false",
                "familiar",
                "famous",
                "fancy",
                "fantastic",
                "far",
                "faraway",
                "far-flung",
                "far-off",
                "fast",
                "fat"
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Create a hashmap names students */
        /* Key: String username, Value: Student Object */
        GradesApplication app = new GradesApplication();

        /* Create students hashmap */
        HashMap<String, Student> students = new HashMap<String, Student>();

        /* Create a single student */
        String student_username = app.createUsername();
        String[] student_name = student_username.split("_");
        Student student1 = new Student(student_name[1]);
        student1.addGrade(34);
        student1.addGrade(64);
        student1.addGrade(84);
        students.put(student_username, student1);

        student_username = app.createUsername();
        student_name = student_username.split("_");
        Student student2 = new Student(student_name[1]);
        student2.addGrade(32);
        student2.addGrade(64);
        student2.addGrade(89);
        students.put(student_username, student2);

        student_username = app.createUsername();
        student_name = student_username.split("_");
        Student student3 = new Student(student_name[1]);
        student3.addGrade(94);
        student3.addGrade(54);
        student3.addGrade(54);
        students.put(student_username, student3);

        student_username = app.createUsername();
        student_name = student_username.split("_");
        Student student4 = new Student(student_name[1]);
        student4.addGrade(54);
        student4.addGrade(84);
        student4.addGrade(84);
        students.put(student_username, student4);

        /* Interface */

        System.out.println("Welcome! Please select one of our students:");
        students.forEach((key, value)->{
            System.out.println(key);
        });
        String userSelection = scanner.next();
        Student selectedStudent = students.get(userSelection);
        selectedStudent.printStudent();
    }

    public String createUsername() {
        /* Adjectives */
        int rand1 = (int)((Math.random() * 100) + 1);
        /* FirstNames */
        int rand2 = (int)((Math.random() * 25) + 1);
        /* Username String */
        return String.format("%s_%s", this.adjectives[rand1], this.firstnames[rand2]);
    }

}