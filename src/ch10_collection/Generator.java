package ch10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generator extends Thread {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    @Override
    public void run() {
        System.out.println("데이터 생성중");

        for (int i = 0; i < 100; i++) {

            try {
                Thread.sleep(100);
                int key = new Random().nextInt(10) + 1;
                //System.out.println(key);

                if (map.containsKey(key) == true) {
                    int newValue = map.get(key) + 1;
                    map.put(key, newValue);
                } else {
                    map.put(key, 1);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 0.1 초 간격으로 100번 동안

        }
        System.out.println("데이터 생성완료");
        PrintResult();
    }

    private void PrintResult() {

        System.out.println("결과 출력");

        for (int i = 1; i <=10 ; i++) {

            int value = map.get(i) ;
            System.out.println(i + "/" + value);

        }



        System.out.println("감사합니다");
    }
}
