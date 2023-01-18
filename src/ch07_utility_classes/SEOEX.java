package ch07_utility_classes;

import java.util.StringTokenizer;

public class SEOEX {
    public static void main(String[] args) {

        String str = "id=hong&password=1234&address=공덕동" ;

        StringTokenizer st1 = new StringTokenizer(str) ;

        while (st1.hasMoreTokens()) {
            String item = st1.nextToken("&") ;
            StringTokenizer st2 = new StringTokenizer(item,"=") ;
            while (st2.hasMoreTokens()) {
                System.out.print(st2.nextToken()+"\t");
            }

            System.out.println();
        }

    }
}
