package ch04_class;

public class AccountMain01 {
    public static void main(String[] args) {
        Account01 soo = new Account01() ;

        Account01 hee = new Account01() ;

        soo.bankname = "국민 은행" ;
        soo.name = "김철수" ;
        soo.no = 1234 ;
        soo.balance = 1000 ;

        hee.bankname = "국민 은행" ;
        hee.name = "박영희" ;
        hee.no = 5678 ;
        hee.balance = 2000 ;

        System.out.println("거래 은행 : " + soo.bankname);
        System.out.println("예금주 : " + soo.name);
        System.out.println("계좌 번호 : " + soo.no);
        System.out.println("예치금 : " + soo.balance);

        System.out.println();

        System.out.println("거래 은행 : " + hee.bankname);
        System.out.println("예금주 : " + hee.name);
        System.out.println("계좌 번호 : " + hee.no);
        System.out.println("예치금 : " + hee.balance);

        soo.Display();
        hee.Display();

        String result = soo.showDeposit();
        System.out.println(result);

        result = hee.showDeposit();
        System.out.println(result);
    }
}