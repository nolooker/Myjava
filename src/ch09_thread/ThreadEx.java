package ch09_thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx extends Thread {
    public ThreadEx(String name) {
        super(name) ;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100 ; i++) {
                Thread.sleep(3000);
                Date date = new Date() ;
                String pattern = super.getName() + "의 쓰레드 시각 : hh시 mm분 ss초" ;
                SimpleDateFormat sdf = new SimpleDateFormat(pattern) ;
                String now = sdf.format(date) ;
                System.out.println(now );
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
