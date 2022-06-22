package day25_constructor;

public class Rectangle {


    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /*
        //WE DO NOT NEED SETINFO WE COMMENTED OUT, WE'LL USE CONSTRUCTOR
        public void setInfo(double length, double width) {
            this.length = length;
            this.width = width;
        }
         */
    public double area(){ return length*width; }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }




}
