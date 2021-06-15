package Class7Q4;

public class CarFactory {

    public static Drivable getCar(String carName)  {
        //try {

            if (carName == null) {
                return null;
            }
            if (carName.equalsIgnoreCase("Fiat")) {
                return new Fiat();
            }
            if (carName.equalsIgnoreCase("BMW")) {
                return new BMW();
            }
            if (carName.equalsIgnoreCase("Porsche")) {
                return new Porsche();
            }

//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return null;
    }
}
