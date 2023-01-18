package ch01_variable_operator;

public class ArithmeticOperator2 {
    public static void main(String[] args) {
        int TIME = 8000 ;

        int hour ;
        int minute ;
        int second ;

        hour = TIME / 3600 ;
        minute = (TIME - hour * 3600) /60 ;

        second = TIME % 60 ;

        System.out.println("시간 : " +TIME);
        System.out.println("시 : " +hour);
        System.out.println("분 : " +minute);
        System.out.println("초 : " +second);

        System.out.println("-----------------------------");

        int x = 20 ;

        x += 5 ;

        x += 10 ;

        x -= 15 ;

        x /= 5 ;

        x *= 100 ;

        int y = 300 + x ;





        System.out.println("x 는 : " +x);

        System.out.println(+y);



    }
}
