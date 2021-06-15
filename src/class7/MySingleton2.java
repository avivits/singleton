package class7;

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
        File logFile = new File("C:\\Users\\IMOE001\\Desktop\\log2.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
        writer.write(text );
        writer.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public static void main(String[] args) throws IOException{

        try {
            MySingleton2 x = MySingleton2.getInstance();
            WriteScanner Wname = new WriteScanner();
            x.getToWrite(Wname.name);
            MySingleton2 y = MySingleton2.getInstance();
            WriteScanner wAge = new WriteScanner();
            y.getToWrite(wAge.age);
            MySingleton2 z = MySingleton2.getInstance();
            WriteScanner wAddress = new WriteScanner();
            z.getToWrite(wAddress.name);
            MySingleton2 a = MySingleton2.getInstance();
            WriteScanner wPhone = new WriteScanner();
            a.getToWrite(wPhone.name);
//            File logFile = new File("C:\\Users\\IMOE001\\Desktop\\log2.txt");
//            BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
//            writer.write(w.name );
//            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
