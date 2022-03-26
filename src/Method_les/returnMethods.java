package Method_les;

public class returnMethods {
    public static void main(String[] args) {  //method with RETURN//1*
        int a = getStrLength("aebpw");
        System.out.println(getStrLength("aebpw"));



        int[] mas = {1, 2, 3, 4};//**
        int[] mas1 = {5, 6, 7, 8};

        for (int i : combineArrays(mas, mas1)) {
            System.out.print(i + ",");
        }
        System.out.println();
        int[] x = combineArrays(new int[] {
            32, 432, 432, 43, 4
        } ,new int[]{9, 869, 876, 6, 7, 6, 7, 7, 5});
        int k = 0;
        while (k < x.length) {
            System.out.print(x[k] + ",");
            k++;
        }
    }

    public static int getStrLength(String str) { //1*
        int strLength = str.length();
        return strLength;


    }

    //create method to combine two arrays
    public static int[] combineArrays(int[] a, int[] b) { //**
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int j = 0;
        for (int i = a.length; i < c.length; i++) {
            c[i] = b[j];
            j++;
        }
        return c;
    }

}
