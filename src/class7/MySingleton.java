package class7;

import java.io.IOException;

public class MySingleton {

    public static void main(String[] args) throws IOException {
        GetAndWrite getAndWrite = GetAndWrite.getInstance();
        getAndWrite.getToWrite("hello");


        }
    }
}
