package SelfPractice.day11_String;

public class Trials {
    public static void main(String[] args) {

        String word = "java++";

        boolean startsWith = word.startsWith("Java");
        boolean firstIndexLastIndex = word.indexOf('j')==1 && word.lastIndexOf('v')==3;

        if(startsWith){
            System.out.println("true");
        }else if (firstIndexLastIndex){

            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }
}
