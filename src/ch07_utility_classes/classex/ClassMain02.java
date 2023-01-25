package ch07_utility_classes.classex;

public class ClassMain02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Human class01 = new Human("김철수", "마포", 20);
        System.out.println(class01);    // toString() 메소드 호출됨

        String className = "ch07_utility_classes.classex.Human";

        try {

            Class pClass = Class.forName(className);

            System.out.println("newInstance() 메소드를 이용하면 객체를 구할 수 있습니다.");

            Human class02 = (Human) pClass.newInstance();  //강등 필요

            class02.setName("김철훈");
            class02.setAddress("가디역");
            class02.setAge(30);

            System.out.println(class02);

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (InstantiationException e) {

            e.printStackTrace();

        }catch (IllegalAccessException e) {

            e.printStackTrace();

        }
    }
}
