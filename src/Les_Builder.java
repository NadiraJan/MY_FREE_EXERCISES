public class Les_Builder {
    public static void main(String[] args) {
        // StringBuilder StringBuilder = new StringBuilder(); //created empty stringbuilder
        StringBuilder stringBuilder2 = new StringBuilder("Animals");//created filled stringbuilder
        //  int capacity;
        //  StringBuilder stringBuilder3= new StringBuilder( capacity:10);//created string building with capacity of memory

       /* stringBuilder2      //we added something new to stbuil2 with APPEND
                .append("a")
                .append("--")
                .append(11)
                .append("--")
                .append(true);
        System.out.println(stringBuilder2);*/

        //Insert
      /*  stringBuilder2.insert(3, "-----");
        stringBuilder2.insert(0, "-----");
        System.out.println(stringBuilder2);*/

        //delete(int start, int end)
        // delete CharAt(int Index)
        stringBuilder2.deleteCharAt(2);//we want to delete a letter"i"from Animals, so we indicated index 2
        System.out.println(stringBuilder2);//result: Anmals

        //STRING conversion to string
       // String string = StringBuilder.toString();

    }
}
