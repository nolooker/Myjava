package ch08_exception.evencheck;

public class EvenCheck extends Exception {

    private String message ;

    public EvenCheck(String message) {

        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "오버라이딩 : " +this.message ;
    }
}
