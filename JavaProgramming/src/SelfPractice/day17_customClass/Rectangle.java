package SelfPractice.day17_customClass;

public class Rectangle {

    public double length;
    public double width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double area(){
        double area= length*width;
        System.out.println("area: " + area);
        return area;
    }

    public double perimeter(){
        double perimeter = 2*length*width;
        System.out.println("perimeter: " + perimeter);
        return perimeter;

    }
}
