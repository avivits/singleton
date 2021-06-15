package class7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MySingleton {


    public static String writeMe(String text) {
        System.out.println(text);
        return text;
    }

    public static void main(String[] args) throws IOException {

            try {
                File logFile = new File("C:\\Users\\IMOE001\\Desktop\\log1.txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
              // String text = "my name is Avivit";
                String text=null;
                writer.write(writeMe("my name is avivit s ") );
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }



        }


    }


