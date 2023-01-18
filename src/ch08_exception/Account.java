package ch08_exception;

public class Account {
    private String name ;
    private int balance = 0;

    public Account(String name) {
        this.name = name;
    }

    public void deposit(int money){
        this.balance += money ;
    }

    public void withdraw(int money) throws NotEnoughMoney{
        if(balance < money){
            System.out.println("\n현재 잔액 : " + balance);
            System.out.println("요청 금액 : " + money);
            String message = "잔액 부족 : " + (money-balance) + "원이 부족합니다." ;
            throw new NotEnoughMoney(message);
        }
        balance -= money ;
    }

    public void display() {
        String message = "%s님의 잔액 : %d원" ;
        System.out.printf(message, name, balance);
    }
}
