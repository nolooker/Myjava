package ch06_abstract_interface.myinterface;

public class SmartPhone extends PDA implements Mp3, MobilePhone {
    private String phoneNo; // 전화 번호
    private String songName ; // 재생할 노래
    private int playtime ; // 재생 시간


    @Override
    public boolean sendSMS(String sms) {
        System.out.println(RECEIVER + "'" + this.phoneNo + "'에게 '" + sms + "' 문자를 보냅니다.");
        return false;
    }

    @Override
    public boolean sendSMS(String[] munjalist) {
        System.out.println("휴대폰 1대에 문자를 여러 번 보내기");
        System.out.println(RECEIVER + this.phoneNo + "에게 여러 개의 문자를 전송합니다.");
        for (int i = 0; i < munjalist.length; i++) {
            System.out.println((i+1) + "번째 문자 '" + munjalist[i] + "' 전송");
        }
        return false;
    }



    @Override
    public void play(String[] manysong) {
        System.out.println("여러 곡 재생하기");
        for (int i = 0; i < manysong.length; i++) {
            System.out.println((i+1) + "번째 노래 '" + manysong[i] + "' 재생");
        }
    }

    @Override
    public boolean receiveCall(String munja) {
        System.out.println(SENDER + "'" + this.phoneNo +  "'" + "로부터 '" + munja +  "'라는 문자가 왔습니다.");
        return false;
    }



    public String getPhoneNo() {
        return phoneNo;
    }

    public SmartPhone() {
    }

    public SmartPhone(String phoneNo){
        this.phoneNo = phoneNo ;
    }

    public SmartPhone(String phoneNo, String songName, int playtime) {
        this.phoneNo = phoneNo ;
        this.songName = songName ;
        this.playtime = playtime ;
    }

    private final String SENDER = "송신자 ";
    private final String RECEIVER = "수신자 ";

    @Override
    public boolean sendCall() {
        System.out.println(RECEIVER + this.phoneNo + "에게 전화를 겁니다.");
        return false;
    }

    @Override
    public boolean receiveCall() {
        System.out.println(SENDER + this.phoneNo + "로부터 전화가 옵니다.");
        return false;
    }

    @Override
    public boolean sendSMS() {
        System.out.println(RECEIVER + this.phoneNo + "에게 문자를 보냅니다.");
        return false;
    }

    @Override
    public boolean receiveSMS() {
        System.out.println(SENDER + this.phoneNo + "로부터 문자가 옵니다.");
        return false;
    }


    @Override
    public void play() {
        System.out.println("재생 정보");
        System.out.println("노래 : " + this.songName );
        System.out.println("재생 시간 : " + this.getPlayTime() );
    }


    private String getPlayTime() {
        String result = "" ;
        int second;
        int minute;

        minute = playtime / 60;
        second = playtime % 60;

        result += minute + "분 " + second + "초" ;
        return result ;
    }


    @Override
    public void stop() {
        System.out.println(this.songName + "를(을) 재생 중지합니다.");
    }


}
