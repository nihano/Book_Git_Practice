package day25_constructor;

import java.rmi.MarshalException;

public class TestRectangleObjects {

    public static void main(String[] args) {

        /*

        //WITHOUT CONSTRUCTOR WE NEED TO CALL SETINFO METHOD

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setInfo(3, 4); // we need to set info for each rectangle object manually

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(4,5);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(5,6);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(6,7);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(7,8);
         */

        Rectangle rectangle1 = new Rectangle(3,4);
        Rectangle rectangle2 = new Rectangle(4,5);
        Rectangle rectangle3 = new Rectangle(5,6);
        Rectangle rectangle4 = new Rectangle(6,7);
        Rectangle rectangle5 = new Rectangle(7,8);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);





    }

}
