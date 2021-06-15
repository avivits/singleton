package Class7Q3;

import java.io.IOException;
import java.util.Scanner;

public class WriteScanner {

//   String name ;
//    String age ;
//    String address;
//    String phone ;

    public static void main(String[] args) throws IOException{

        try {
            MySingleton2 x = MySingleton2.getInstance();

            Scanner userName = new Scanner(System.in);
            System.out.println("enter name");
            x.getToWrite(userName.next());

            Scanner userAge = new Scanner(System.in);
            System.out.println("enter age");
            x.getToWrite(userAge.next());

            Scanner userAddress = new Scanner(System.in);
            System.out.println("enter address");
            x.getToWrite(userAddress.next());

            Scanner userPhone = new Scanner(System.in);
            System.out.println("enter phone");
            x.getToWrite(userPhone.next());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
