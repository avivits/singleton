package class4;

public class MyexcepMain {

    public static void main(String[] args)  {
        try {
            throw new Exception("wrong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
