package ch05_package_inheritance;

public class RefCasting {
    public static void main(String[] args) {
        //클래스이름  객체이름 =  new  생성자();
        Object data = new String("하하하") ;

        String korea = new String("대한민국");
        Integer jungsu = new Integer(5) ;
        Book java = new Book("자바", 10000, "kosmo");

        Display(korea); // Object obj = new String("대한민국");
        Display(jungsu); // Object obj = new Integer(5) ;
        Display(java); // Object obj = new Book("자바", 10000, "kosmo");
    }

    private static void Display(Object obj) {

        // obj 인스턴스가 정수 타입(Integer)이 맞나요?
        if(obj instanceof Integer){
            Integer su = (Integer)obj ;
            System.out.println("정수 : " + su);
            System.out.println("정수 : " + su.toString());

        }else if(obj instanceof String){
            String mystr = (String)obj ; // 강등
            System.out.println("문자열 : " + mystr);
            System.out.println("문자열 : " + mystr.toString());
        }else if(obj instanceof Book){
            System.out.println("책 : " + obj.toString());

            String name = ((Book)obj).getName();
            System.out.println("책이름 : " + name);

            int price = ((Book)obj).getPrice();
            System.out.println("단가 : " + price);

            String education = ((Book)obj).getEducation();
            System.out.println("교육 기관 : " + education);

            Book myjava = (Book)obj;
            System.out.println("나의 책 정보 :\n" + myjava.toString());

        }else{

        }
    }
}
