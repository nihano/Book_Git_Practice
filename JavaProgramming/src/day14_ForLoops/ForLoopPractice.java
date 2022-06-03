package day14_ForLoops;

public class ForLoopPractice {
    public static void main(String[] args) {

        //iteration makes the condition false eventually

        for (int i = 10; i>5;i--){ //i:10,9,8,7,6,
            System.out.println("Hello World " + i);//1,2,3,4,5,


        }
        System.out.println("--------------------------");

        //sum of all the numbers between 1-100

        int sum=0;

        for(int i =1; i<=100; i++){
            sum  += i;
        }
        System.out.println(sum); // it does not need to be printed so we pass the print statement after the loop

        //print all the alphabet letters A-Z

        for(char i= 'A'; i<='Z'; i++){
            System.out.print(i+ " "); //" " used to give space between letters
            // print instead println in order to print in one line
        }
        System.out.println();
        System.out.println("Hello");

        //print the alphabets in backwards Z-A

        for (char i='Z'; i>='A';i--){
            System.out.print(i + " ");
        }

        System.out.println(); //to append(add) a new line
        System.out.println("Cydeo");

        /*
        for(int i=5; i<=10; i--){
            //System.out.println("Hello Cydeo");
         }
        //i-- will never make this condition false so it will be executed infinite times

        //System.out.println("Hello World");
        //because for loop is infinite. this statement will never be executed
         */




    }
}
