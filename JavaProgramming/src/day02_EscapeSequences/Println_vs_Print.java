package day02_EscapeSequences;

public class Println_vs_Print {


 public static void main(String[] args) {
  System.out.println("Hello everyone!");
  System.out.println("How are you today?");

  System.out.println("----------------------");

  System.out.print("Hello everyone! "); //use regular shortcut for println and delete the ln
  System.out.print("How are you today?");



 }

}

/*
1.println appends a new line
2.print does not append a new line.
if you write two line by using print
those two lines will be printed in the same line
 */