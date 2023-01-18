package ch08_exception;

public class EvenCheck extends Exception{
    private String message ; // 사용자가 지정해줄 예외 메시지

    public EvenCheck(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "내용 : " + this.message;
    }
}