package Inheritance;

public class Developer extends Employee{

    private String level;
    private String language;

    public Developer(String firstname, String lastname, int age, int inn, int number, int snils, String level, String language) {
        super(firstname, lastname, age, inn, number, snils);
        this.level = level;
        this.language = language;
    }

    public Developer(String firstname, String lastname, int age, String level, String language) {
        super(firstname, lastname, age);
        this.level = level;
        this.language = language;
    }
}
