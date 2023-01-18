package ch06_abstract_interface.myinterface;

public class MiniPhone extends SmartPhone {
    public MiniPhone(String phoneNo){
        super(phoneNo) ;
    }

    @Override
    public boolean sendSMS() {
        System.out.println(super.getPhoneNo() + "로 문자를 전송하였습니다.");
        return true;
    }

    @Override
    public boolean receiveSMS() {
        System.out.println(super.getPhoneNo() + "로부터 문자가 왔네요.");
        return true;
    }
}
