package class5;

import java.util.ArrayList;

public class ArrayListStr {
    public static void main(String[] args) {


        ArrayList<String> myArray = new ArrayList<>();

        myArray.add( "A");
        myArray.add("B");
        myArray.add("C");

        for (int i=0 ; i<3 ; i++) {
            if (i==1 ){
                System.out.println(myArray.get(i));
            }
        }
    }
}
