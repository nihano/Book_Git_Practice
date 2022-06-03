package SelfPractice.day16_NestedLoops;

public class FreqOfChar {
    public static void main(String[] args) {

        String str = "aabcccd";
        // first i need to find each char
        // then freq of each char
        //first i need print first char then add freq then check for
        //second char if it is printed before skip it then move next



        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; i < str.length(); i++) {

                if (ch == str.charAt(j)) {
                    count++;


                }


            }
            System.out.println(count);

        }


    }

}
