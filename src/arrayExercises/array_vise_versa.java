package arrayExercises;

// output of array ascending & decsending

public class array_vise_versa {
    public static void main(String[] args) {
        int[] values ={1, 5, 7, 9, 11};
        printArray(values);
        printArrayReverse(values);

    }
    public static void printArray(int[]values){
        for(int i=0;i<values.length;i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    public static void printArrayReverse(int[] values){
        for (int i=values.length-1; i>=0;i--){
            System.out.print(values[i]+" ");
        }
        System.out.println();
    }
}
/* RESULT
1 5 7 9 11
11 9 7 5 1
 */