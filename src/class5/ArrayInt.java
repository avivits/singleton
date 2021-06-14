package class5;

public class ArrayInt {

    public static void main(String[] args) {
        int [] myList = {5,3,52,22,55};
        boolean found = false;
        int i ;
        for ( i = 0; i < myList.length; i++) {
            if (myList[i] == 64) {
                found = true;
                break;
            }
        }

            if (found)
            {
                System.out.println("That number was found at index " + i);

            }
            else
            {
                System.out.println("That number was not found.");

            }
        }



    }






