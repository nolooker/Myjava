package ch08_exception;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.print("이름 입력 : ");
        String name = scan.next() ;

        Account account = new Account(name) ;

        int money = 10000 ;
        account.deposit(money); // 입금 하기
        account.display();

        while(true){
            try {
                System.out.print("\n출금할 금액 입력 : ");
                int val = scan.nextInt() ;

                account.withdraw(val);
                account.display();

            } catch (NotEnoughMoney err) {
                System.out.println(err.toString());
                System.out.println(err.getMessage());
                err.printStackTrace();
            }
        }
    }
}
