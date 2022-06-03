package SelfPractice.Mentor;

import java.util.Scanner;

public class AnimalFeast2 {
    public static void main(String[] args) {

        boolean result = AnimalDish("great blue heron", "garlic naan");
        System.out.println(result);


        //great blue heron ==> garlic naan
        //chickadee ==> chocolate cake

    }

    public static boolean AnimalDish(String dishName, String animalName) {


        char firstIndexDish = dishName.charAt(0);
        char lastIndexDish = dishName.charAt(dishName.length() - 1);
        char firstIndexAnimal = animalName.charAt(0);
        char lastIndexAnimal = animalName.charAt(animalName.length() - 1);

        boolean first = firstIndexDish == firstIndexAnimal;
        boolean last = lastIndexDish == lastIndexAnimal;
        if (first && last) {
            return true;
        } else {
            return false;
        }

    }

}