package day14_ForLoops;

public class OverloadingTheMainMethod {
    public static void main(String[] args) {


        System.out.println("A"); //only this one will get executed
        //you can understand this one is the real main method by seeing the run button in the same line with main method
        main(25);// B
        main(2.05);//C
        main(true);//D
    }

    public static void main(int args){

        System.out.println("B");

    }

    public static void main(double args){

        System.out.println("C");

    }

    public static void main(boolean args){
        System.out.println("D");
    }


}
