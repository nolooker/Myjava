package ch04_class;

public class Account01 {
    String bankname  ;
    String name ;
    int no ;
    int balance ;

    void Display() {
        System.out.println( "거래 은행 : " + bankname);
        System.out.println( "예금주 : " + name);
        System.out.println( "계좌 번호 : " + no);
        System.out.println( "예치금 : " + balance);
        System.out.println();
    }

    String showDeposit(){
        String result ;
        if(balance >= 1500){
            result = name + "님은 예치금(" + balance + ")이 많네요." ;
        }else{
            result = name + "님은 예치금(" + balance + ")이 적네요." ;
        }

        return result;
    }
}
