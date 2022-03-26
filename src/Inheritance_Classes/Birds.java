package Inheritance_Classes;

public class Birds {
    private String name;
    private Wings wings;

    public Birds(String name, Wings wings) {  //this gaat over deze klas
        this.name = name;     //this name belongs to this class, =name belongs to constructor
        this.wings = wings;
    }

    public void walk(){
        System.out.println("Ho-ho-ho");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
