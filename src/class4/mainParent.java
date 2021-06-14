package class4;

public class mainParent {
    public static void main(String[] args) {

        Child child = new Child();
        System.out.println(child.a);
//        Parent parent = new Parent();
//        child.getAFromBase();
//        parent.show();
//        child.callShow();

        Parent child1 = new Child();
        System.out.println(child1.a);
        child1.show();

    }
}
