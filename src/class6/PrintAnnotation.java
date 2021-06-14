package class6;

import org.testng.annotations.*;

public class PrintAnnotation {

    @BeforeClass

    public static void printBeforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void printAfterClass() {
        System.out.println("after class");
    }


    @BeforeMethod
    public static void printBeforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public static void printAfterMethod() {
        System.out.println("after method");
    }

    @Test
    public static void printTest() {
        System.out.println("test");
    }
}
