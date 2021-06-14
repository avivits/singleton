package class7;

import java.io.IOException;

public class GetAndWrite {

    private static GetAndWrite text = null;

    private GetAndWrite() {}

    public static GetAndWrite getInstance() {
        if (text == null) {
            text = new GetAndWrite();
        }
        return text;
    }

    public void getToWrite(String text) throws IOException {

        System.out.println("text= " + text);
}
    }
