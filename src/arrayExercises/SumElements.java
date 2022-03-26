package arrayExercises;
//опред-ть сумму эл-в целочислен. массива,расположенных между миним. и максим. значениям

public class SumElements {
    public static void main(String[] args) {
        int[] values = {1, 2, 0, 5, 6, 4, 10, 3};
        System.out.println("max index: " + findMaxIndex(values));
        System.out.println("min index: " + findMinIndex(values)); //RESULT: 6 and 2 6th index and 2dindex that
        System.out.println(calculateSumBetween(values));         // means el-ts 0and10
    }

    public static int calculateSumBetween(int[] values) {
        int maxIndex = findMaxIndex(values);
        int minIndex = findMinIndex(values);
        if (minIndex > maxIndex) { //we compare only indexes of array not numbers in array
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int result = 0;
        for (int i = minIndex + 1; i < maxIndex; i++) {

            result += values[i];
        }
        return result;
    }

    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        int minValue = values[minIndex];
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;

            }
        }
        return maxIndex;
    }
}

