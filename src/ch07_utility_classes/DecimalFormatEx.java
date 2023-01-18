package ch07_utility_classes;

import java.text.DecimalFormat;
import java.util.Random;

public class DecimalFormatEx {
    public static void main(String[] args) {
        double su = 1234.56789 ;

        String pattern = "###,###.00" ;
        DecimalFormat df1 = new DecimalFormat(pattern);
        String result = df1.format(su) ;
        System.out.println("결과01 : " + result);

        pattern = "000,000.00" ;
        df1 = new DecimalFormat(pattern);
        result = df1.format(su) ;
        System.out.println("결과02 : " + result);

        int su1 = 1234 ;
        pattern = "000000" ;
        DecimalFormat df2 = new DecimalFormat(pattern);
        result = df2.format(su1) ;
        System.out.println("결과03 : " + result);

        int month = 2 , day = 4 ; // "02월 04일"
        pattern = "00" ;
        DecimalFormat df3 = new DecimalFormat(pattern) ;
        result = df3.format(month) + "월 " + df3.format(day) + "일"  ;
        System.out.println("결과04 : " + result) ;

        double voterate = 0.62452 ;
        pattern = "[###.00]%" ;
        DecimalFormat df4 = new DecimalFormat(pattern) ;
        result = df4.format(voterate)  ;
        System.out.println("결과05 : " + result) ;

        double su2 = 0.1234567 ;
        pattern = "00.##E0" ;
        DecimalFormat df5 = new DecimalFormat(pattern) ;
        result = df5.format(su2)  ;
        System.out.println("결과06 : " + result) ;

        pattern = "000.0000" ;
        DecimalFormat df6 = new DecimalFormat(pattern) ;
        result = df6.format(Math.PI)  ;
        System.out.println("결과07 : " + result) ;

        int gaesu = 30 ;
        System.out.println("랜덤한 수 " + gaesu  + "개 만들기");
        Random random = new Random() ;
        pattern = "000.000%" ;
        DecimalFormat df7 = new DecimalFormat(pattern) ;

        for (int i = 0; i < gaesu ; i++) {
            double rand = random.nextDouble();
            String imsi = df7.format(rand) ;
            System.out.println(imsi);
        }
    }
}
