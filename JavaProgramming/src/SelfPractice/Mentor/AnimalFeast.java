package SelfPractice.Mentor;

import java.util.Scanner;

public class AnimalFeast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter animal name");
        String animalName = input.nextLine().toLowerCase();

        System.out.println("Enter dish name");
        String dishName = input.nextLine().toLowerCase();


        input.close();

        boolean result  = AnimalDish(animalName, dishName);
        System.out.println(result);



        //great blue heron ==> garlic naan
        //chickadee ==> chocolate cake

    }

    public static boolean AnimalDish(String dishName, String animalName){


        String firstIndexDish = dishName.substring(0,1);
        String lastIndexDish = dishName.substring(dishName.length()-1);
        String firstIndexAnimal = animalName.substring(0,1);
        String lastIndexAnimal = animalName.substring(animalName.length()-1);

        boolean first =  firstIndexDish.equals(firstIndexAnimal);
        boolean last = lastIndexDish.equals(lastIndexAnimal);
        if(first && last){
            return true;
        }else{
            return false;
        }


    }
}

/*
All the animals are having a feast! Each animal is bringing one dish.
There is just one rule: the dish must start and end with the same letters
as the animal's name.
For example, the great blue heron is bringing garlic naan
and the chickadee is bringing chocolate cake.
Write a method that takes the animal's name and dish
as arguments and returns true or false to indicate
whether the beast is allowed to bring the dish to the feast.
Assume that beast and dish are always lowercase strings,
and that each has at least two letters.
Beast and dish may contain hyphens and spaces,
but these will not appear at the beginning or end of the string.
They will not contain numerals
 */