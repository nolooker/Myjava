package ch06_abstract_interface.myinterface;

public interface MobilePhone {
    public boolean sendCall();
    public boolean receiveCall();
    public boolean sendSMS();
    public boolean receiveSMS();

    // for PhoneMain03
    public boolean receiveCall(String munja);
    public boolean sendSMS(String[] munjalist);
    public boolean sendSMS(String sms);
}
