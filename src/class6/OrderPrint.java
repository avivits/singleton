package class6;

import org.testng.annotations.Test;

public class OrderPrint {

    @Test(priority = 1)
    public static void printA() {
        System.out.println("A");
    }

    @Test(priority = 3)
    public static void printC() {
        System.out.println("C");
    }

    @Test(priority = 2)
    public static void printB() {
        System.out.println("B");
    }


}
