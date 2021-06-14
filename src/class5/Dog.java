package class5;

public class Dog {

     private String name;
     private String color;
     private int age;

    Dog (String name1, int age1 ){
    this.name = name1;
    this.age = age1;
    }

    Dog (String color1){
    this.color=color1;
    }

    String getName () { return name;     }
    void setName (String name) {this.name=name;}

    int getAge () { return age;     }
    void setAge (int age) {this.age=age;}

    String getColor () { return color;     }
    void setColor (String color) {this.color=color;}



}
