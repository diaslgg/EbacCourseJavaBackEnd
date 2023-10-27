package br.com.diaslgg.modulo12.Colecoes;

/**
 * Represents a person defined by its biological gender.
 */
public class PeopleNameGender {

    private String name;
    private String gender;

    public PeopleNameGender (String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
