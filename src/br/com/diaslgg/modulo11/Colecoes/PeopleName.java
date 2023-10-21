package br.com.diaslgg.modulo11.Colecoes;

import java.util.*;

/**
 * Class to work with data structures, mostly Lists
 */
public class PeopleName {
    public static void main(String[] args) {
        printNames();

    }

    /**
     * Receive the names from the console, separeted by commas
     * @return The String array containing the names.
     */
    public static String getNames(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Make a list of names, separating each name by commas.");
        return scannerObject.nextLine();
    }

    /**
     * Put all names collectd form the console and put then into a ArrayList
     * @return ArrayList with names
     */
    public static List<String> putInList() {
        String[] names = getNames().split(", ");

        List<String> namesList = (new ArrayList<>(Arrays.asList(names)));
        Collections.sort(namesList);

        return namesList;
    }

    /**
     * Print all names from the ArrayList created
     */
    public static void printNames(){
        for (String n : putInList())
            System.out.println(n);
    }

}
