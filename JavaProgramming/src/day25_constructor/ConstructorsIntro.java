package day25_constructor;

public class ConstructorsIntro {

    public ConstructorsIntro(){
        System.out.println("Object is created by using  no argument constructor");
    }
    public ConstructorsIntro(int a){
        System.out.println("Object created by using int argument constructor");

    }

    public static void main(String[] args) {
        ConstructorsIntro obj1 = new ConstructorsIntro(10);
        ConstructorsIntro obj2 = new ConstructorsIntro(10);
        ConstructorsIntro obj3 = new ConstructorsIntro(10);
    }


    /*
    public ConstructorsIntro(){ // everytime when we use this constructor to create object this code fregment can get executed at the same time
        System.out.println("Object is created by using default constructor");
    }

    public static void main(String[] args) {

        new ConstructorsIntro(); //object - only time constructor executed is when we create the object
        //code fragment in the constructor will get executed at the same time
        // it will print -->Object is created by using default constructor when we run

    }
     */

}
