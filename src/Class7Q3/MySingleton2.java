package Class7Q3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MySingleton2 {

    private static MySingleton2 text = null;
    //public String s;

    private MySingleton2() {    //Make constructor as private
      //  s="hiiii";

    }

    public static MySingleton2 getInstance() {      //a static method that has return type object of this singleton class
        if (text == null) {
            text = new MySingleton2();
        }
        return text;
    }

    public void getToWrite(String text) throws IOException {
        try{
//        System.out.println(text);
        File logFile = new File("C:\\Users\\IMOE001\\Desktop\\log3.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(logFile,true));
        writer.append(' ');
        writer.append(text );
        writer.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }


}
