package class4;

public class Child extends Parent {
     int a = 200;

    // prints a variable directly from base class
    void getAFromBase() {
        System.out.println(super.a);
    }

    private void getAFromChild() {
        System.out.println(a);
    }

    // call method directly from parent
    protected void callShow() {
        show(); // no need for super
    }
}
