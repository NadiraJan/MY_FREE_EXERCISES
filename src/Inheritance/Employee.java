package Inheritance;

public class Employee extends Person {

    private int inn;
    private int number;
    private int snils;

    public Employee(String firstname, String lastname, int age, int inn, int number, int snils) {
        super(firstname, lastname, age);
        this.inn = inn;
        this.number = number;
        this.snils = snils;
    }

    public Employee(String firstname, String lastname, int age) {
        super(firstname, lastname, age);


    }

}

