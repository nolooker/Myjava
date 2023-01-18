package ch06_abstract_interface.myinterface;

public class PhoneMain02 {
    public static void main(String[] args) {
        String phoneNo = "01012345678" ;
        MiniPhone smartPhone = new MiniPhone(phoneNo) ;

        smartPhone.sendSMS();
        smartPhone.receiveSMS();
    }
}
