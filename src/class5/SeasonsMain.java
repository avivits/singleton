package class5;

import java.util.Scanner;

public class SeasonsMain {
    public static void main(String[] args) {

        System.out.println("please enter a number between 1 to 4");
        Scanner userNum = new Scanner(System.in);
        String num = userNum.next();


        switch (num) {
            case "1":
                Seasons seasons1 = Seasons.SPRINT;
                System.out.println( seasons1 );
                break;
            case "2":

                Seasons seasons2 = Seasons.SUMMER;
                System.out.println( seasons2 );
                break;
            case "3":
                Seasons seasons3 = Seasons.FALL;
                System.out.println( seasons3 );
                break;
            case "4":
                Seasons seasons4 = Seasons.WINTER;
                System.out.println( seasons4 );
                break;
        }
    }
}
