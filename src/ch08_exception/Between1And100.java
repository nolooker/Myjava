package ch08_exception;

public class Between1And100 extends Throwable {
    private String message ;

    public Between1And100(String message) {
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
