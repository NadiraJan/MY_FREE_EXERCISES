package Conditionals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task_If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age");

        int age = in.nextInt();
        if (age > 21) {
            System.out.println(">21");
        }
        if (age >= 18 && age <= 21) {
            System.out.println(">=18 && <=21");
        } else {
            System.out.println("<18");
        }
        int x = 8753;
        if (x > 100 || x < 10000 || x % 5 == 0) { //any way true because one of conditions is true
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        boolean b = true;
        if (x > 100 || x < 10000 || x % 5 == 0) { //%5 кратное пяти
            b = true;
        } else {
            b = false;
        }
        System.out.println(b);

        int x1 = 232333333;
        boolean b1 = x1 < 10000 || x1 % 5 == 0;
        System.out.println(b1);


    }
}

