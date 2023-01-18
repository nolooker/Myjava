package ch09_thread.th;

public class ThreadTest {
    public static void main(String[] args) {

        ThreadEx soo = new ThreadEx("철수") ;

        soo.start();

        new ThreadEx("영희").start();

        RunnableEx mrun = new RunnableEx() ;
        Thread th = new Thread(mrun) ;
        th.start();

        System.out.println("쓰레드 개수 : " +Thread.activeCount());



    }
}
