package class5;

import java.util.ArrayList;

public class DogMain {
    public static void main(String[] args) {
        Dog dog1 =  new Dog( "Hugo" , 12);
        Dog dog2 = new Dog("brown");
        System.out.println(dog1.getName() + "," + dog1.getAge() + "," + dog2.getColor());

        dog1.setAge(15);
        dog2.setColor("white");
        System.out.println(dog1.getName() + "," +dog1.getAge() +"," + dog2.getColor());

        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);

        System.out.println(dogList.get(0).getName());
        System.out.println(dogList.get(1).getColor());
        System.out.println(dogList.size());
        dogList.remove(0);
        dogList.remove(0);
        System.out.println(dogList.size());
    }
}
