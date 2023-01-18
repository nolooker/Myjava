package ch07_utility_classes;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        String str = "소녀시대 빅뱅 원더걸스 exid 걸스데이";

        StringTokenizer st1 = new StringTokenizer(str);
        System.out.println("토큰 갯수 : " + st1.countTokens());

        while(st1.hasMoreTokens()){
            String item = st1.nextToken();
            System.out.println(item);
        }
        System.out.println();
        String str2 = "소녀시대/빅뱅/원더걸스/exid/걸스데이";
        String delimiter = "/" ;
        StringTokenizer st2 = new StringTokenizer(str2, delimiter);

        while(st2.hasMoreTokens()){
            String item = st2.nextToken() ;
            System.out.println(item);
        }

        System.out.println();
        str = "소녀시대/빅뱅/원더걸스/exid/걸스데이";
        StringTokenizer st3 = new StringTokenizer(str, delimiter, true);
        while(st3.hasMoreTokens()){
            String item = st3.nextToken() ;
            System.out.println(item);
        }


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        str = "id=hong&password=1234&address=철산동" ;
        StringTokenizer st4 = new StringTokenizer(str, "&") ;
        while(st4.hasMoreTokens()){
            String item = st4.nextToken() ;
            StringTokenizer st5 = new StringTokenizer(item, "=") ;
            while(st5.hasMoreTokens()){
                System.out.print(st5.nextToken() + "\t");
            }
            System.out.println();
        }
    }
}
