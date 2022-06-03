package SelfPractice.Replit;
import java.util.Scanner;
public class abc {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize = input.nextLine();

        int screenPrice = 0;

        if(screenSize.equals("13.3")){
            screenPrice=200;
        }else if(screenSize.equals("15.0")){
            screenPrice=300;
        }else if(screenSize.equals("17.3")){
            screenPrice=400;

        }

        System.out.println(screenPrice);

    }
}
