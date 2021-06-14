package class6;

import myJar.MyFirstJar;
import org.testng.annotations.Test;

public class NewJar {

    @Test
    public void printJarNew(){
        MyFirstJar j = new MyFirstJar();
        j.printMyJar("avivit");
    }

}
