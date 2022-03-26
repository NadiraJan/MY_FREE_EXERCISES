package Conditionals;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase_String {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("enter s");
        String s = kbd.next();
         switch (s.toLowerCase()){
             case "green":
                 System.out.println("green");
                 break;

             case "red":
                 System.out.println("red");
                 break;
             default:
                 System.out.println("color not found");
                 break;
         }
    }
}
