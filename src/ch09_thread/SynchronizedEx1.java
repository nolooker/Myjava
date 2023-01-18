package ch09_thread;

public class SynchronizedEx1 {
    public static void main(String[] args) {
        int inputmoney = 1000 ;
        ATM atm = new ATM(inputmoney);

        Thread soo = new Thread(atm, "김철수");
        Thread hee = new Thread(atm, "박영희");

        soo.start();
        hee.start();
    }
}
