package br.com.diaslgg.modulo11.Colecoes;

import java.util.*;

public class PeopleNameGender {
    public static void main(String[] args) {
        printNames();
    }

    public static String getNames(){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Make a list of names, separating each name by commas and adding the ones " +
                "gender after a hyphen.");


        return scannerObject.nextLine();
    }

    public static List<String> putInList() {
        String[] names = getNames().split(", ");

        return (new ArrayList<>(Arrays.asList(names)));
    }

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

    public static void printNames() {
        List<String> namesList = separateNamesGender();

        for (String i : namesList)
            System.out.println(i);
    }

}
