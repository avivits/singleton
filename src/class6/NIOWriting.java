package class6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOWriting {



        public static void main(String[] args) {
            String content = null;
            try {
                content = new String(Files.readAllBytes(Paths.get("C:\\Users\\IMOE001\\Desktop\\AVIVIT1.txt")));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(content);
        }
    }





