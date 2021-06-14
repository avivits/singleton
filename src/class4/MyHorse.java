package class4;//class3-Q1:

public class MyHorse {

     String name;
     int age;

    public MyHorse(String HorseName , int HorseAge){  //constructor
        name = HorseName;
        age = HorseAge;
    }

    public MyHorse (String HorseName) {   //another constructor
        name = HorseName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    void show(){
        System.out.println(400);
    }

}


