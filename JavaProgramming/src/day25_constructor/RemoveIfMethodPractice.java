package day25_constructor;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {
    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");



        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("Small"));//p: variable represents each elements of the arraylis
        System.out.println(smallDogs);

        /*
        ArrayList<Dog> smallDogs = new ArrayList<>();
        smallDogs.addAll(Arrays.asList(dogs)); // we passed this directly into constructor above
        smallDogs.removeIf(p-> !p.size.equalsIgnoreCase("Small"));
         */


        /*
        //WITH FOR EACH LOOP
        for (Dog each : dogs) { // each: each dog object
            if (each.size.equalsIgnoreCase("Small")){
                smallDogs.add(each);
            }
        }

        System.out.println(smallDogs);
         */

        System.out.println("--------------------------------------------");

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));
       /*
        for (Dog each : dogs) {
            if (each.age<=4){
                youngDogs.add(each);
            }
        }
        System.out.println(youngDogs);
        */
        youngDogs.removeIf(p ->p.age>4);
        for (Dog each : youngDogs) {
            System.out.println(each.name);
        }

        System.out.println("---------------------------------------------");
        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender=='M');
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf(p->p.gender=='F');

        System.out.println("---------------------------------------------");

        //ANOTHER TASK REMOVE ALL THE SMALL DOGS
        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> list  = new ArrayList<>(Arrays.asList(dogs2)); //in order to remove elements, we can convert array to arraylist. because array size is immutable, we cannot remove elements from object of array.
        list.removeIf(p -> p.size.equalsIgnoreCase("small")); // remove if the dogs size is small
        dogs2 = list.toArray(new Dog[0]); //we need dogs2 does not have any small size dog. we can assign the list to array variable dogs2. there is a method to convert arraylist to array(toArray). We set the size as 0, it will adjust the size automatically.
        System.out.println(Arrays.toString(dogs2));
        System.out.println(dogs2.length); //3





    }


}

/*
1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from day17 package

    1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the dogs array to smallDogs arrayList

            Note: DO NOT use any loops

    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the dogs array to youngDogs arrayList

            Note: DO NOT use any loops

    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

            Note: DO NOT use any loops

    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs array to maleDogs arrayList

            Note: DO NOT use any loops


 */