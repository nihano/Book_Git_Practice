package SelfPractice.day15;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to reserve a room?Yes/No?");
        String answer = input.next().toLowerCase();
        int kingBedPrice = 120;
        int queenBedPrice = 100;
        int singleBedPrice = 80;
        String roomType = input.next().toLowerCase();



        while (  !(answer.equals("yes") || answer.equals("no")) ){
            System.err.println("Invalid answer! Please enter Yes/No");
            answer = input.next().toLowerCase();
        }
        if (answer.equals("yes")) {
            System.out.println("Which type of room would you like to reserve?");
            roomType = input.next().toLowerCase();

            if (roomType=="king"){
                System.out.println(kingBedPrice + "$");
            } else if (roomType=="queen") {
                System.out.println(queenBedPrice + "$");
            }else{
                System.out.println(singleBedPrice + "$");
            }


        }else if  (answer.equals("no")){
            System.out.println("Have a nice day!");

    }


}}


/*
8. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */
