package ch08_exception;

public class ExcepTest03 {
    public static void main(String[] args) {
        String str = "hello korea" ;

        try {
            int idx1 = str.indexOf("asdf") ;

            System.out.println("문자열이 안 맞아요");

        }catch (NumberFormatException err) {
            int idx2 = str.indexOf("kor") ;

            System.out.println("숫자가 아니에요");

        }catch (ArithmeticException err) {
            int idx3 = str.indexOf("llo") ;

            System.out.println("다른 글자에요");

        }catch (Exception err) {
            System.out.println("나머지 기타 예외 발생");

        }finally {
            System.out.println("무조건 실행");
        }

        int idx = str.indexOf("asdf") ;
        String temp = str.substring(0,idx) ;

        System.out.println(temp);
    }
}
