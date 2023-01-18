package ch04_class;

public class Account04 {
    static String bankname = "국민 은행" ;

    private String name ;
    private int no ;
    private int balance = 100 ;

    public Account04(String name, int no, int balance) {
        this.name = name ;
        this.no = no ;
        this.balance = balance ;
    }

    public Account04(String name, int no) {
        this.name = name ;
        this.no = no ;
        System.out.println("예치금은 " + this.balance + "값으로 초기화 됩니다.");
    }

    public void Display() {
        System.out.println("거래 은행 : " + bankname);
        System.out.println("예금주 : " + name);
        System.out.println("계좌 번호 : " + no);
        System.out.println("예치금 : " + balance);
        System.out.println();
    }

    public void deposit(int money) {
        System.out.println(money + "원 입금");
        balance += money ;
    }

    public void withdraw(int money) {
        System.out.println(money + "원 인출");
        balance -= money ;
    }

    public int getBalanceInfo() {
        return balance ;
    }
}
