package ch10_collection;

import java.util.Enumeration;
import java.util.Properties;

public class MyPropertyExam {
    public static void main(String[] args) {
        Properties prop = new Properties() ;
        prop.put("id", "hong") ;
        prop.put("name", "홍길동") ;
        prop.put("password", "1234") ;
        prop.put("address", "마포구 공덕동") ;
        prop.put("zipcode", "12345") ;

        String id = prop.getProperty("id") ;
        System.out.println("아이디 : " + id);

        // 급여(salary)가 존재하는 지 확인해보세요.
        String salary = prop.getProperty("salary", "100") ;
        System.out.println("급여 : " + salary);

        // 20원 인상된 새 급여를 출력하기
        Integer newSalary = Integer.parseInt(salary) + 20 ;
        System.out.println("새 급여 : " + newSalary);

        // 휴대폰(handphone)이 존재하지 않으면, 신규 추가해 보세요.
        if(prop.getProperty("handphone") == null){
            prop.put("handphone", "01011112222") ;
        }

        String hphone = prop.getProperty("handphone") ;
        System.out.println("핸드폰 : " + hphone);

        System.out.println("요소 개수 : " + prop.size());

        Enumeration enu = prop.propertyNames();
        //System.out.println(enu.toString());
        while(enu.hasMoreElements()){
            String property = (String)enu.nextElement();
            System.out.println(property);
        }
        System.out.println();

        Enumeration enu2 = prop.keys();
        while(enu2.hasMoreElements()){
            //nextElement()와 getProperty()를 사용하여
            // 키/값 형식으로 출력하기
            String property = (String)enu2.nextElement();
            String value = prop.getProperty(property) ;
            System.out.println(property + "/" + value);
        }

    }
}
