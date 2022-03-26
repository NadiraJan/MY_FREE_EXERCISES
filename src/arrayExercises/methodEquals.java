package arrayExercises;

//Написать метод equals,который опр-т равны ли между собой соответ-е эл-ты 2мерных массивов

public class methodEquals {
    public static void main(String[] args) {
        int[][] values1 = {
                {1, 2, 3},
                {5, 2, 40,},
                {9, 10},
        };
        int[][] values2 = {
                {1, 2, 3},
                {5, 2, 8},
                {9, 10},
        };
        boolean result = equals(values1,values2);
        System.out.println(equals(values1,values2));
    }

    public static boolean equals(int[][] values1, int[][] values2) {
        if (values1.length != values2.length) {
            return false;
        }
        for (int i = 0; i < values1.length; i++) { //comparing rows of arrays
            int[] row1 = values1[i]; //without creating row1&row2 we can write:
            int[] row2 = values2[i]; //values[i][j]!=values2[i][j]
            if ( row1.length != row2.length){
                return false;
            }
            for (int j = 0; j < row1.length; j++) { //comparing columns of arrays
                if (row1[j] != row2[j]) {
                    return false;

                }

            }
        }
        return true;
    }
}