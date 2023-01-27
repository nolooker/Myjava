package ch10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generator extends Thread{
    private Map<Integer, Integer> map = null ;

    public Generator() {
        this.map = new HashMap<Integer, Integer>();
    }

    @Override
    public void run() {
        System.out.println("데이터 생성중\n잠시만 기다려 주세요.");
        for (int i = 0; i < 100 ; i++) {
            try {
                Thread.sleep(100);
                int key = new Random().nextInt(10) + 1 ;
                //System.out.println(key);

                if(map.containsKey(key) == true){
                    int newValue = map.get(key) + 1 ;
                    map.put(key, newValue) ;
                }else{
                    map.put(key, 1) ;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("데이터가 생성이 되었습니다.");
        PrintResult();
    }

    private void PrintResult() {
        System.out.println("해당 결과를 출력합니다.");
        for (int i = 1; i <= 10 ; i++) {
            int value = map.get(i) ;
            System.out.println(i  + "/" + value);
        }
    }
}
