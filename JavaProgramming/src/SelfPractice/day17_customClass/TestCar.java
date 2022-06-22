package SelfPractice.day17_customClass;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Ford", "Focus", "Black", 14000);
        System.out.println(car1);

        car1.start();



    }
}
