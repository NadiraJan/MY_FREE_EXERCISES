package Conditionals;

public class WhileConditions {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 10){
            System.out.println("HELLO " +counter);
            counter +=2; //om endless cycle te vermeiden
        }
                //do while cycle

        int x = 201902654;
        int digit = 0;

        do {
            digit = x % 10;
            x = x /10;
            System.out.println(digit); //справа налево
        }
        while (x> 0);;
    }
}
