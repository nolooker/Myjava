package ch08_exception;

public class MyException01 {
    public static void main(String[] args) {
        int x = 3, y = 0 ;
        int[] arr = {10, 20, 30 } ;

        try {
            arr[3] = 50 ; //배열 요소 인덱스 문제
            System.out.println( x / y ); //0으로 나누기 문제

            System.out.println("예외 발생시 저는 실행이 안됩니다.");

        }catch (ArithmeticException err){
            System.out.println("0으로 나누시면 안되요.");


        }catch (ArrayIndexOutOfBoundsException err){
            // ArrayIndexOutOfBoundsException err = new ArrayIndexOutOfBoundsException();
            System.out.println("배열 인덱스 범위를 벗어 났습니다.");
            System.out.println("예외 객체 정보 확인");
            System.out.println("메시지 : " + err.getMessage());
            System.out.println("문자열 : " + err.toString());

            err.printStackTrace(); // 오류 내용을 추적하여 메시지들을 출력


        }catch (Exception err){
            System.out.println("기타 나머지 예외 발생");
            err.printStackTrace();

        }finally {
            System.out.println("나는 무조건 실행이 됩니다.");
        }
    }
}
