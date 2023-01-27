package ch10_collection;

import java.util.*;

public class VehicleMain {
    public static void main(String[] args) {
        Map<String, VehicleController> map = new HashMap<>() ;

        Properties prop = new Properties() ;
        prop.put("car", "ch10_collection.CarController");
        prop.put("horse", "ch10_collection.HorseController");
        prop.put("airplane", "ch10_collection.AirplaneController");

        Set<Object> keyset = prop.keySet() ;
        for(Object key:keyset){
            String command = (String)key ;
            String className = prop.getProperty(command) ;
            try{
                Class<?> myobject = Class.forName(className) ;

                VehicleController vehicle = (VehicleController)myobject.newInstance() ;
                map.put(command, vehicle) ;

            }catch(Exception err){
                err.printStackTrace();
            }
        }
        System.out.print("메뉴 선택 : 1(car), 2(horse), 3(airplane) : ");
        Scanner scan = new Scanner(System.in) ;
        int menu = scan.nextInt() ;
        String command = null ;
        if(menu==1){
            command = "car" ;
        }else if(menu==2){
            command = "horse" ;
        }if(menu==3){
            command = "airplane" ;
        }else{

        }

        VehicleController action = map.get(command) ;
        if(action==null){
            System.out.println("잘못된 요청 커맨드입니다.");
        }else{
            action.drive();
        }
    }
}

