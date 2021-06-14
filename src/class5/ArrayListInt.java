package class5;

import java.util.ArrayList;

public class ArrayListInt {

    public static void main(String[] args) {

        int sum = 0;
        float average;


        ArrayList<Integer> myArrayInt = new ArrayList<>();
        for (int i=0 ; i<6 ; i++) {
            myArrayInt.add(i);
            sum = sum + i ;
            System.out.println( myArrayInt.get(i));

        }
        System.out.println("sum is:" + sum);
        System.out.println("size is: " + myArrayInt.size());
        average = sum / myArrayInt.size();
        System.out.println(average);
    }
}
