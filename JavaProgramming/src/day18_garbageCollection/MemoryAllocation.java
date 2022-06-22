package day18_garbageCollection;

//there can only be one public class in one file and it has to match with file name
//that's why we cannot give public here

class Car {

    public String brand;
    public String model;
    public String color;
    public int year;

}


public class MemoryAllocation {


    public static void main(String[] args) {

        int a = 100; //stack

        Car car = new Car();
      //   stack    heap



    }

    public static void method1(){
        int b = 200;//stack
    }

    public static void method2(){
        String c = "Hello World";
        //stack     heap (string pool)

        String d = new String("Hello World");
        //stack     heap
    }


}
