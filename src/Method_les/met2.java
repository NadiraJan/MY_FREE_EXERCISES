package Method_les;

import java.util.Scanner;

public class met2 {
    public static void main(String[] args) {
        int b = 20;
        int a = 3;
        int c = 12;
        System.out.println(discriminant(a, b, c));




    }

    public static int discriminant(int a, int b, int c) {
        int D = b * b - (4 * a * c);

        return D;
    }



    }





