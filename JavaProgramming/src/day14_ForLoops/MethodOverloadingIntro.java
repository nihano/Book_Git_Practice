package day14_ForLoops;

public class MethodOverloadingIntro {

    public static void methodA(){

        //method names cannot be same unless it is overloaded
        //parameters must be different if the method name is same
        //parameter data type can be same but number of parameters must be different in this case
    }

    public static void methodA(int a){

    }

    public static void methodA(double b){

    }

    public static void methodA(int a, int b){

    }


}
