package class4;

public class TV implements Remote{

//    void TurnOn () {
//        System.out.println("the tv turned on");
//    }
//
//    void TurnOff() {
//        System.out.println("the tv turned off");
//
//    }


    @Override
    public void turnOn() {
        System.out.println("the tv turned on");

    }

    @Override
    public void turnOff() {
        System.out.println("the tv turned off");

    }
}
