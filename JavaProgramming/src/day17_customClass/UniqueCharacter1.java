package day17_customClass;

public class UniqueCharacter1 {
    public static void main(String[] args) {

        String str = "aabcccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of string
            char each = str.charAt(i);

            if (str.indexOf(each)==str.lastIndexOf(each)  ){ // if the the first index of the character and the last index of the character same that means if is unique
                unique+=each;
            }
        }

        System.out.println(unique);

    }
}
