package br.com.diaslgg.modulo12.Colecoes;

import java.util.*;

public class PeopleNameGenderMap {

    public static void main(String[] args) {

        List<Map<String,List<PeopleNameGender>>> peopleInputsList = sortPeopleByGender();
        for(Map<String,List<PeopleNameGender>> i : peopleInputsList) {
            for(List<PeopleNameGender> j:i.values()) {
                for(PeopleNameGender k:j){
                    System.out.println(k.getName());
                }
            }

        }

    }

    /**
     * Receives a person input with a separated by comma name and gender, instantiate an object and put it into a list.
     * @return List.
     */
    public static List<PeopleNameGender> getInformation() {
        List<PeopleNameGender> peopleList = new ArrayList<>();
        Scanner scannerObject = new Scanner(System.in);

        while (true) {
            System.out.println("What's your name, and how do you recognize yourself, male or female? If you " +
                    "and stop the essay, type 'quit'.");
            String[] data = scannerObject.nextLine().split(", ");
            for(String i : data){
                if (i.equalsIgnoreCase("quit")){
                    return peopleList;
                }
            }
            peopleList.add(new PeopleNameGender(data[0], data[1]));
        }
    }

    /**
     * Sort a list of PeopleNameGender object into two HashMaps, by its gender, and put the HashMaps into a List.
     * @return List of HashMaps
     */
    public static List<Map<String,List<PeopleNameGender>>> sortPeopleByGender(){
        List<PeopleNameGender> maleList = new ArrayList<>();
        Map<String, List<PeopleNameGender>> maleMap = new HashMap<>();
        List<PeopleNameGender> femaleList = new ArrayList<>();
        Map<String, List<PeopleNameGender>> femaleMap = new HashMap<>();


        List<Map<String,List<PeopleNameGender>>> responseList = new ArrayList<>();

        for (PeopleNameGender i : getInformation()) {
            if (i.getGender().equalsIgnoreCase("male")) {
                maleList.add(i);
            } else if (i.getGender().equalsIgnoreCase("female")) {
                femaleList.add(i);
            }
        }
        if (!maleList.isEmpty()) {
            maleMap.put("Male", maleList);
            responseList.add(maleMap);
        }
        if (!femaleList.isEmpty()) {
            femaleMap.put("Female", femaleList);
            responseList.add(femaleMap);
        }

        return responseList;
    }

}
