package Class7Q3;

import java.io.IOException;
import java.util.Scanner;

public class WriteScanner {

    String name ;
    String age ;
    String address;
    String phone ;

    //public static void main(String[] args) throws IOException {
public WriteScanner(){
        Scanner userName = new Scanner(System.in);
        System.out.println("enter name");
        Scanner userAge = new Scanner(System.in);
        System.out.println("enter age");
        Scanner userAddress = new Scanner(System.in);
        System.out.println("enter address");
        Scanner userPhone = new Scanner(System.in);
        System.out.println("enter phone number");
        try{
             name = userName.next();
             age = userAge.next();
             address = userAddress.next();
             phone = userPhone.next();
          //  System.out.println(phone);
        }catch (Exception e){e.printStackTrace();}
    }
}
