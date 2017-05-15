/**
 * Compiliation: javac Store.java
 * Execution: java Store
 *
 * Simple store cli - makes receipt.
 *
 */

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        /* Create scanner */
        Scanner scanner = new Scanner(System.in);

        /* Receipt variable */
        String receipt = "item\tprice\tquantity\ttotal\n";

        int menuOption;

        do {
            /* Menu option */
            System.out.printf("menu:\n1. Sale \n2. Print Receipt \n3. Exit\n");
            menuOption = scanner.nextInt();

            /* Perform Option */
            receipt = performOption(scanner, menuOption, receipt);
        } while(menuOption != 3);

        System.out.println("Exiting Store!");
        System.exit(0);
    }

    public static String performOption(Scanner scanner, int menuOption, String receipt) {
        switch(menuOption) {
            case 1:
                /* Sale */
                String newLine = performSale(scanner);
                receipt = receipt.concat(newLine);
                break;
            case 2:
                /* Print Receipt */
                System.out.println(receipt);
                break;
            default:
                /* Wrong user input */
        }
        return receipt;
    }

    public static String performSale(Scanner scanner) {
        System.out.println("What item do you want to buy?");
        String item = scanner.next();
        System.out.println("What's the price of the item?");
        float price = scanner.nextFloat();
        System.out.printf("How many %s would you like?", item);
        int quantity = scanner.nextInt();
        float itemTotal = calculateTotal(price, quantity);
        return String.format("%s\t%.2f\t%d\t%.2f\n", item, price, quantity, itemTotal);
    }

    public static float calculateTotal(float price, int quantity) {
        return price * quantity;
    }
}