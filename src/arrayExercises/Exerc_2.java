package arrayExercises;

//Написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или 17, и печатающую его.

public class Exerc_2 {
    public static void main(String[] args) {

        int[] values = new int[100];
        fillArray(values);
        array_vise_versa.printArray(values);

    }

    //first we create a method
    public static void fillArray(int[] values) {
        int currentIndex = 0; //for counter
        for (int currentValue = 1; currentIndex < values.length; currentValue++) {
            if (currentValue % 13 == 0 || currentValue % 17 == 0){
                values[currentIndex++] = currentValue;//increment mojno srazu napisat'
           // currentIndex++;
        }
    }}
}
