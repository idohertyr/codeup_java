/**
 * File IO
 *
 * Compiliation: javac fileio.java
 * Execution: java fileio
 *
 * Command line application to keep track of contacts.
 * Each contact is a name and phone number.
 *
 * Application should be able to:
 * 1. Show all your contacts
 * 2. Add a new contact
 * 3. Search a contact by name.
 * 4. Delete an existing contact.
 *
 * Guidelines:
 * * The text file should contain one contact per line.
 * * When the application starts, the contact list should be read from the file.
 * * Before the application exits, the contacts file should be rewritten.
 * * The user interface for your application should include a mainmenu like the following, where the user
 *      will need to enter a number between 1 and 5.
 */


import java.io.FileWriter;
import java.util.Scanner;
import java.util.List;
import java.io.FileWriter;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class fileio {

    private Scanner scanner;
    private List contacts;

    public static void main(String[] args) {
        fileio fileio = new fileio();

        // Read contents from contacts file
        String fileName = "./data/contacts.txt";
        if (! Files.exists(Paths.get(fileName))) {
            try {
                Files.createFile(Paths.get(fileName));
            } catch(IOException e) {
                System.out.println(e);
            }
        }
        fileio.contacts = fileio.readContacts(fileName);

        int userInput;
        do {
            // Ask for user input
            fileio.printMenu();
            userInput = fileio.getInt(1,5);

            // Execute user selection
            fileio.userSelection(userInput);
        } while(userInput != 5);
    }

    public fileio() {
        this.scanner = new Scanner(System.in);
    }

    public List readContacts(String filename) {
        List lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filename));
        } catch (Exception e) { // catch em all
            System.out.println("Some exception was thrown" + e);
        }
        return lines;
    }

    // function: prints menu
    protected void printMenu() {
        System.out.printf(
                "1. View Contacts.\n" +
                "2. Add new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n"
        );
        System.out.print("Enter an option 1-5: ");
    }

    public String newContact() {
        System.out.println("Please enter new contact name and phone number on one line: ");
        return scanner.nextLine();
    }

    public void addContact(String newContact) {
        this.contacts.add(newContact);
    }

    public void printContacts() {
        System.out.printf("Name | Phone number\n" +
                "--------------------\n");
        for (Object contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchContacts() {
        System.out.println("Enter name to search: ");
        String userSearch = scanner.nextLine();
        for (Object contact : contacts) {
            if (String.valueOf(contact).contains(userSearch)) {
                System.out.println(contact);
            }
        }
    }

    public void removeContacts() {
        System.out.println("Enter name to remove: ");
        Object deleteContact = null;
        String userSearch = scanner.nextLine();
        for (Object contact : contacts) {
            if (String.valueOf(contact).contains(userSearch)) {
                deleteContact = contact;
            }
        }
        contacts.remove(deleteContact);
    }

    public void writeToFile() {
        System.out.println("Writing to file..");
        System.out.println("all done.");
        FileWriter writer = null;
        try {
            writer = new FileWriter("./data/contacts.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Object contact: contacts) {
            try {
                writer.write(String.valueOf(contact)+ "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void userSelection(int userInput) {
        switch(userInput){
            case 1:
//                View Contacts
                this.printContacts();
                break;
            case 2:
//                Add a new contact
                this.addContact(this.newContact());
                break;
            case 3:
//                Search a contact by name
                this.searchContacts();
                break;
            case 4:
//                Delete an existing contact
                this.removeContacts();
                break;
            case 5:
//                Exit
                this.writeToFile();
                break;
        }
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public int getInt(int min, int max){
        int num;
        try {
            String possibleNumber = this.getString();
            num = Integer.valueOf(possibleNumber);
        } catch (NumberFormatException e) {
            System.out.print("Please enter a number between " + min + " and " + max + ": ");
            return getInt(min, max);
        }

        if(num >= min && num <= max){
            return num;
        }

        System.out.println(num + " number out of range, try again");
        return getInt(min, max);
    }

}
