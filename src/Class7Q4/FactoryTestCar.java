package Class7Q4;

import java.io.IOException;

public class FactoryTestCar {

    public static void main(String[] args) throws IOException {

        CarFactory carFactory = new CarFactory();
        Drivable car1 =CarFactory.getCar("Fiat");
        car1.drive();
        Drivable car2 =CarFactory.getCar("BMW");
        car2.drive();
        Drivable car3 =CarFactory.getCar("Porsche");
        car3.drive();
    }
}
