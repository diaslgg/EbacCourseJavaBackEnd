package br.com.diaslgg.modulo11.Colecoes;

import java.util.*;

public class PeopleName {
    public static void main(String[] args) {
        printNames();

    }

    public static String getNames(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Make a list of names, separating each name by commas.");
        return scannerObject.nextLine();
    }

    public static List<String> putInList() {
        String[] names = getNames().split(", ");

        List<String> namesList = (new ArrayList<>(Arrays.asList(names)));
        Collections.sort(namesList);

        return namesList;
    }

    public static void printNames(){
        for (String n : putInList())
            System.out.println(n);
    }

}
