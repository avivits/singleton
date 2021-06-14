package class6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileTest {
    public static void main(String[] args) {
        try {
            File logFile=new File("C:\\Users\\IMOE001\\Desktop\\AVIVIT1.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
            writer.write ("Hello world");
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
