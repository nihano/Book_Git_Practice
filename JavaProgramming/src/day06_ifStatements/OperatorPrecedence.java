package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println( 5 + 2 * 3 );
        System.out.println( 7 + 3 - 2 / 2);

        System.out.println( -5 + 3); //-2 negative operator executed first

        System.out.println(!true == false);
        //                  false  == false logical not operator will be executed first

        System.out.println( 10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                  true   == false && "Java" == "Python" || 'a' == 'A'
        //                      false  &&  false || false
        //                          false || false
        //                              false

        System.out.println( 100 >= 20 && 40 * 2 > 60);
        //                  100>= 20  &&  80   > 60
        //                   true  &&  true (<> <= >= which ever comes first executed first)
        //                          true

        int a =20;
        System.out.println(a);


         a += 10 + 2 * 3;
         // += 10 + 6
         // += 16
         // += 36

    }
}
