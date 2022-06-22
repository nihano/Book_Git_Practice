package SelfPractice.day17_customClass;

public class Car {

    public String make;
    public String model;
    public String color;
    public int price;

    public void setInfo(String make, String model, String color, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void start   (){
        System.out.println(make + " "+ model+ " is starting");
    }
}
