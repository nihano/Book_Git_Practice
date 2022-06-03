package day14_ForLoops;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java";
        //            0123

        //"avaJ"

        String reverse = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse); //"avaJ"

        System.out.println("----------------------------");

        String name = "Nihan Oztekin";
        String result = reverse(name);

        System.out.println(result);

    }

    public static String reverse(String str){
        String reverse =""; //to contain all the characters of the given string in reverse order

        for (int i = str.length()-1; i>=0 ; i--) { // i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // to get each character of the string starting from last index to index 0
        }

        return reverse;
    }

}
