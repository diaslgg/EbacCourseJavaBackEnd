package br.com.diaslgg.modulo11.Colecoes;

import java.util.*;

/**
 * Class of study to work with Collections in Java, mostly Lists
 */
public class PeopleNameGender {
    public static void main(String[] args) {

        printNames();
    }

    /**
     * Get names from the console, separated with commas and determining the ones gender after hyphen.
     * @return The names in an Array String
     */
    public static String getNames(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Make a list of names, separating each name by commas and adding the ones " +
                "gender after a hyphen.");


        return scannerObject.nextLine();
    }

    /**
     * Puts all names received into a List.
     * @return List with names
     */
    public static List<String> putInList() {
        String[] names = getNames().split(", ");

        return (new ArrayList<>(Arrays.asList(names)));
    }

    /**
     * Separates the picked names by gender
     * @return Response List with all names sorted alphabetically and separated by gender.
     */
    public static List <String> separateNamesGender(){
        List<String> maleNames = new ArrayList<>();
        List<String> femaleNames = new ArrayList<>();

        for (String i : putInList())
            if (Character.toLowerCase(i.charAt(i.length()-1)) == 'm') {
                maleNames.add(i);
            } else {
                femaleNames.add(i);
            }
        Collections.sort(maleNames);
        Collections.sort(femaleNames);

        List<String> result = new ArrayList<>();
        result.addAll(femaleNames);
        result.addAll(maleNames);

        return result;
    }

    /**
     * Print all names in the console.
     */
    public static void printNames() {
        List<String> namesList = separateNamesGender();

        for (String i : namesList)
            System.out.println(i);
    }

}
