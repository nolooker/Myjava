package ch07_utility_classes;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random rnd = new Random() ;
        for (int i = 0; i < 2 ; i++) {
            System.out.println((i+1) + "번째 랜덤 값 추출");
            System.out.println("boolean 타입 : " + rnd.nextBoolean());
            System.out.println("int 타입 : " + rnd.nextInt());
            System.out.println("long 타입 : " + rnd.nextLong());
            System.out.println("float 타입 : " + rnd.nextFloat());
            System.out.println("double 타입 : " + rnd.nextDouble());
            System.out.println("가우시안 타입 : " + rnd.nextGaussian());
        }

        // 0 <= rnd.nextInt(3) < 3
        // -5 이상 8 이하의 임의의 정수 10개 만들기
        // 0 <= rnd.nextInt(8- -5 + 1) < (8- -5 + 1)
        // 0 <= rnd.nextInt(14) < 14
        // -5 <= rnd.nextInt(14) - 5 < 9

        System.out.println();

        int start = -5 ; // 하한값
        int end = 8 ; // 상한 값
        int gaesu = 10 ; // 추출 개수
        int mybound = end - start + 1 ;

        int[] array = new int[gaesu] ;

        for (int i = 0; i < array.length; i++) {
            int rand = rnd.nextInt(mybound) + start ;
            System.out.println(rand);
            array[i] = rand ;
        }
        System.out.println("배열 요소 출력");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        gaesu = 11 ;
        int truepart = 0 , falsepart = 0  ;
        for (int i = 0; i < gaesu ; i++) {
            boolean result = rnd.nextBoolean() ;
            if(result == true){
                truepart += 1;
            }else{
                falsepart += 1;
            }
        }
        String menu = truepart >= falsepart ? "짜장면" : "짬뽕" ;
        System.out.println("참 : " + truepart);
        System.out.println("거짓 : " + falsepart);
        String message = "오늘 점심 메뉴 : %s\n" ;
        System.out.printf(message, menu);
    }
}
