package Method_les;

public class myMethod {
    public static void main(String[] args) { //void does not return anything //2
        Greeting("VASYA");

        int[] mas = {1, 2, 3};  // 4

        multiElement(mas, 10);//value is a number which we give to multiply our array's elements

        // if value=10 RESULT: 10,20,30
        for (int i = 0; i < mas.length; i++) {

            System.out.print(mas[i] + ",");
        }

    }

    public static void Greeting(String name) { //1
        System.out.println("Hello, " + name + "!"); //SIMPEL METOD WITHOUT RETURN
    }

    public static void multiElement(int[] array, int value) { //3
        for (int i = 0; i < array.length; i++) {
            array[i] *= value;
        }
    }

}
