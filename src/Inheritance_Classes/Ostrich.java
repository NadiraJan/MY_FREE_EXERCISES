package Inheritance_Classes;

public class Ostrich extends Birds {      //inheritance


    public Ostrich(String name, Wings wings) {  //super is voor superclass gebruikt enkel in constructor
        super(name, wings);
    }

    public void hideHead(){
        System.out.println("I'm an Ostrich and I scared");
        super.walk();
    }

}
