package Conditionals;

import java.util.Scanner;

public class Task_Switch {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int c = 0;
        System.out.println("enter your c: ");
        c = kbd.nextInt();

        switch (c) {
            case 1:
                System.out.println("green");
                break;
            case 2:
            case 5:
                System.out.println("red");
                break;
            case 3:
                System.out.println("blue");
                break;
                default:
                    System.out.println("does not exist");
                    break;
            }
        }


    }

