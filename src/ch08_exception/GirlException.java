package ch08_exception;

public class GirlException extends Exception{
    private String message ;

    public GirlException(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "문자열 : " + this.message;
    }
    @Override
    public String getMessage() {
        return "메시지 : " + this.message;
    }
}
