package Inheritance;

public class Person {

    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public String getfullName(){
        return "lastName - ${this.lastName} firstName - ${this.firstName}";
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    /*    public void greeting(){
            System.out.println("Hello I'M A person my name is $(this.firstName)");

        }*/

    }
}
