package ch06_abstract_interface.myinterface;

public class PhoneMain01 {
    public static void main(String[] args) {
        String phoneNo = "01012345678" ;
        String songName = "광화문 연가" ;
        int playtime = 210 ; // 재생 시간

        SmartPhone phone01 = new SmartPhone(phoneNo, songName, playtime);

        phone01.sendCall();
        phone01.play();

        System.out.println("계산기 호출");
        int x = 3, y = 5 ;
        int result = phone01.calculate(x, y) ;
        System.out.println("계산 결과 : " + result);

        phone01.receiveSMS() ;
        phone01.stop();
    }
}
