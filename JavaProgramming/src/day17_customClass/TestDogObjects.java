package day17_customClass;

import java.awt.font.TextAttribute;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.bread = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Gray";


        Dog dog2 = new Dog();
        dog2.name = "Bella";
        dog2.bread = "Golden Retriever";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Small";
        dog2.color = "Gold";


        Dog dog3 = new Dog();
        dog3.setInfo("Loki", "Chow Chow", 'M', 3, "Medium", "Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Chuck", "Bulldog", 'F', 5, "Small", "Brown");


        dog1.eat();


        System.out.println(dog1); //it will print the hash code? before creating toString method in dog class
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat();

    }


}
