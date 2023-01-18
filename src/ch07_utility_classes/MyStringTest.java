package ch07_utility_classes;

public class MyStringTest {
    public static void main(String[] args) {
        String str = "hong@naver.com" ;

        int alt = str.indexOf("@") ;
        System.out.println("@위치 : " + alt);
        String id = str.substring(0, alt);
        String email = str.substring(alt+1);
        System.out.println("아이디 : " + id);
        System.out.println("이메일: " + email);

        String sometext = "abc@naver.com;def@daum.net" ;

        String[] maillist = sometext.split(";") ;
        for (int i = 0; i < maillist.length; i++) {
            alt = maillist[i].indexOf("@") ;
            id = maillist[i].substring(0, alt);
            email = maillist[i].substring(alt+1);

            String message = "%d번째 회원의 id : %s, 이메일 : %s\n" ;
            System.out.printf(message, (i+1), id, email);
        }
    }
}
