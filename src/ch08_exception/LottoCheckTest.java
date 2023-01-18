package ch08_exception;

import java.util.Scanner;

public class LottoCheckTest {
    public static void main(String[] args) {
        Scanner scan = null ;
        int lotto = 0 ;

        scan = new Scanner(System.in) ;
        System.out.println("로또 번호 입력 : ");

        lotto = scan.nextInt() ;

        if (lotto < 0 || lotto > 45 ) {

        }else {

        }


    }
}
