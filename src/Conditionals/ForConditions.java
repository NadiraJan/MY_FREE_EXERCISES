package Conditionals;

import java.util.Scanner;

public class ForConditions {
    public static void main(String[] args) {
        int x = 0;
        Scanner kbd = new Scanner(System.in);
       /* for(int i = 0; i<10; i++){
            System.out.println("counter : " + i);
        }*/
        for (int i = 11; i <= 15; i++) {
            System.out.println("enter a value ");
            x = kbd.nextInt();

            System.out.println("result " + i*x);
        }
    }
}
