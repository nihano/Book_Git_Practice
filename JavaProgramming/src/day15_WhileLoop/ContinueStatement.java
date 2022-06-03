package day15_WhileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            if (i == 4) {   // when the i is equal to 4 then any code fragment that we gave in that iteration will not be executed
                continue;
            }

            System.out.println(i);
        }

        System.out.println("------------------------------");

        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);


        }

        System.out.println("------------------------------");

        for (char i = 'A'; i <= 'G'; i++) {
            if (i == 'B' || i == 'E') {
                continue;
            }

            System.out.println(i);

        }

        System.out.println("---------------------------");

        // find the sum of all the even numbers between 50~100

        for (int i = 50; i <101 ; i+=2) {
            if (i%2==0){ //first way
                System.out.print(i+" "); //to print it in the same line we use print instead of println
            }
        }

        System.out.println(); //to add a new line

        //50, 52, 54, 56, 58
        for (int i = 50; i<101; i+=2){ // second way
            System.out.print(i+" ");

        }

        System.out.println();

        for (int i = 50; i <101 ; i++) { //third way

            if (i%2!=0){ // if it is odd
                continue; // skip it
            }

            System.out.print(i+" ");
        }


        System.out.println(); //to give a new line

    }
}
