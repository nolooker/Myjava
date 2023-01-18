package ch09_thread;

public class ThreadMainEx {
    public static void main(String[] args) {
        Thread myth = Thread.currentThread() ;
        long id = myth.getId() ;
        System.out.println("쓰레드 아이디 : " + id);

        String name = myth.getName() ;
        System.out.println("쓰레드 이름 : " + name);

        // time sharing) 시간을 잘게 쪼개서 특정 순간 여러 개의 쓰레드 중에서 하나를 실행하는 기법
        // 1 <= priority <= 10
        int priority = myth.getPriority() ;
        System.out.println("쓰레드 우선 순위 : " + priority);

        // Thread.State는 Inner Class
        Thread.State state = myth.getState() ;
        System.out.println("쓰레드 상태 : " + state);

        System.out.println("하하하");
        int wait = 3000 ;
        System.out.println(wait/1000 + "초 동안 대기합니다.");

        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("호호호");

    }
}
