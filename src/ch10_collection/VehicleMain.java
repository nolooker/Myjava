package ch10_collection;

import java.util.*;

public class VehicleMain {
    public static void main(String[] args) {
        Map<String, VehicleController> map = new HashMap<>();

        Properties prop = new Properties();
        prop.put("car", "ch10_collection.CarController") ;
        prop.put("horse", "ch10_collection.HorseController") ;
        prop.put("airplane", "ch10_collection.AirplaneController") ;

        Set<Object> keyset = prop.keySet() ;

        for(Object key:keyset){
            String command = (String)key ;
            String commandName = prop.getProperty(command);

            try {
                // commandName이라는 문자열을 이용하여 객체 생성
                Class<?> handlerClass = Class.forName(commandName);

                // 자바 동적 객체 생성하기
                VehicleController handlerInstance =
                        (VehicleController) handlerClass.getDeclaredConstructor().newInstance();

                // 맵 구조에 커맨드와 관련 교통 수단 객체를 넣기
                map.put(command, handlerInstance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.print("선택 메뉴 : 1(car), 2(horse), 3(airplane) : ");
        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt() ;
        String command = null ;
        if(menu==1){
            command = "car" ;
        }else if(menu==2){
            command = "horse" ;
        }else if(menu==3){
            command = "airplane" ;
        }else{

        }
        VehicleController action = map.get(command) ;
        if(action==null){
            System.out.println("잘못된 커맨드입니다.");
        }else{
            action.drive();
        }
    }
}

