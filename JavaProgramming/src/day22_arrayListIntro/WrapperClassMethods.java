package day22_arrayListIntro;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1);//201

        int num = Integer.parseInt(str);
        // Integer num1 = Integer.parseInt(str); //unboxing?

        System.out.println(num + 1);//21

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2); // 20 wrapper class value

        System.out.println("-----------------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s); // double primitive value

        Double num4 = Double.valueOf(s); // wrapper class value

        System.out.println(num3);
        System.out.println(num4);

        String x = "true";
        boolean r1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);// true, if the string has anything than true it will print false because we converted it to boolean
        System.out.println(r2);

        System.out.println("-----------------------------------------");

        char ch = 'A';
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isLower = Character.isLowerCase(ch);
        boolean isUpper = Character.isUpperCase(ch);
        boolean isLetterOrDigit = Character.isLetterOrDigit(ch); // if special character it will give false so we can give !
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLower = " + isLower);
        System.out.println("isUpper = " + isUpper);
        System.out.println("isLetterOrDigit = " + isLetterOrDigit);
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("-----------------------------------------");

        // task that we have done after learning strings and loops
        // extract all the digits from the given string and find the sum of them
        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) { // we converted to char array to get each character as char value
            if (Character.isDigit(each)) {// to verify if it is digit
                sum += Integer.parseInt("" + each); // convert to integer value to add to the sum, also parse method accepts only String we converted charcter eact to a String by concatenating and empty String
            }
            
        }

        System.out.println("sum = " + sum); //15


    }

}
