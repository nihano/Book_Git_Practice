package day22_arrayListIntro;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        String str = "Java";

        int a1 = 10; // primitives are not supported in the data structures other that Arrays
        Integer a2 = 10; // Wrapper classes supported in other data structures

        System.out.println("------------------------------------");

        //AUTOBOXING EXAMPLES
        int b1 = 100;
        Integer b2 = b1; // autoboxing

        char ch = 'A';
        Character ch2 = ch; // Autoboxing

        double d1 = 5.5;
        Double d2 = d1; // Autoboxing

        System.out.println("------------------------------------");
        //UNBOXING EXAMPLES

        Integer n1 =20; // can implicitly be casted to int. you can assign int
        int n2 =n1;
    //    long n3 = n1; // we can assign int to long/double/float directly as long as the primitive has larger range. it is best to convert its own primitive though
    //    double n4 = n1;

        Character e1 = 'Z';
        char e2 = e1;

     //   int e3 = e1; //it will be number not a character
     //   int e4 = e1; //it will be number not a character










    }

}
