package ch09_thread;

import java.util.Random;

public class RandomCreator extends Thread{
    @Override
    public void run() {
        Random rand = null ;
        try {
            rand = new Random() ;

            for (int i = 0; i < 10 ; i++) {
                Thread.sleep(1000);
                int jusawee = rand.nextInt(6) + 1 ;
                String imsi = (i+1) + "번째 주사위 눈금 : " + jusawee ;
                System.out.println(imsi);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
