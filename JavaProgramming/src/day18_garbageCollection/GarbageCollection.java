package day18_garbageCollection;

import day17_customClass.Dog;

import java.util.Locale;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1 = "Java";
        s1=null; //will be eligable for garbage collection

        System.out.println(s1);
        //System.out.println(s1.toUpperCase()); //NullPointerException because object does not exist

        System.out.println("---------------------------------");

        String str1 = "Python";
        str1="CYDEO";

        System.out.println(str1);

        System.out.println("------------------");

        // from dog class in day17
        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow Chow", 'M', 3, "Medium", "Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Bulldog", 'F', 5, "Small", "Brown");

        dog1=dog2;
        System.out.println(dog1);
        System.out.println(dog2);

    }

}
