package ch10_collection;

import java.util.Enumeration;
import java.util.Properties;

public class MyPropertyExam {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.put("id", "hong");
        prop.put("name", "홍길동");
        prop.put("password", "1234");
        prop.put("address", "마포구 공덕동");
        prop.put("zipcode", "123-456");

        System.out.println("프로피티 수 : " + prop.size());

        String id = prop.getProperty("id");
        System.out.println("아이디 : " + id);

        //급여(salary)가 존재하는 지 확인
        String salary = prop.getProperty("salary", "100");
        System.out.println("급여 : " + salary);

        // 20원 인상된 새 급여를 출력하기
        Integer newsalary = Integer.parseInt(salary) + 20;
        System.out.println("새 급여 : " + newsalary);

        if (prop.getProperty("hphone") == null) {
            prop.put("hphone", "010-3333-4444");
        }

        String hphone = prop.getProperty("hphone");
        System.out.println("휴대폰 : " + hphone);

        System.out.println("요소 개수 : " + prop.size());

        Enumeration enu = prop.propertyNames();
//        System.out.println(enu.toString());
        while (enu.hasMoreElements()) {
            String property = (String) enu.nextElement();
            System.out.println(property);
        }

        System.out.println();

        Enumeration enu2 = prop.keys();
        while (enu2.hasMoreElements()) {
            // nextElement() 와 getProperty() 를 사용하여
            // 키/값 형식으로 출력하기
            String property = (String) enu2.nextElement();
            String value = prop.getProperty(property);
            System.out.println(property + "/" + value);

        }


        System.out.println("toString() 메소드 : " + prop.toString());

        prop.list(System.out);

    }
}
