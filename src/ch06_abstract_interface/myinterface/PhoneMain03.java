package ch06_abstract_interface.myinterface;

/*
1. 문자 내용을 클래스 외부에서 입력 받아서 처리하기
    송신자 '01012345678'로부터 '잘 있었니?'라는 문자가 왔습니다.
2. 노래 여러 곡을 입력 받아서 재생시키기
    배열로 입력해주면 될듯...
3. 휴대폰 1대에 문자를 3번 보내기
    전송할 문자열은 배열 초기화로 사용하면 될듯...
4. 여러 개의 휴대폰에 동일한 문자를 보내 보기
    휴대폰 목록을 배열 초기화, 보낼 문자는 String ...
*/
public class PhoneMain03 {
    public static void main(String[] args) {
        String phoneNo = "01012345678" ;

		System.out.println("----------------------------------");
        SmartPhone phone01 = new SmartPhone(phoneNo);
        phone01.receiveCall("잘 있었니?");

		System.out.println("----------------------------------");
        String[] songs = {"광화문 연가", "사랑과 우정 사이"};
        phone01.play(songs);

		System.out.println("----------------------------------");
        String[] sendlist = {"잘 지내지?", "조만간 함 볼래"};
        phone01.sendSMS(sendlist);

		System.out.println("----------------------------------");
        SmartPhone[] array = new SmartPhone[3] ;
        array[0] = new SmartPhone("01011112222");
        array[1] = new SmartPhone("01033334444");
        array[2] = new SmartPhone("01055556666");

        for (int i = 0; i < array.length; i++) {
            array[i].sendSMS("문자 배달이요~~");
        }
    }
}
