package ch08_exception;

public class LottoException extends Exception{

    private int number ; // 숫자

    public LottoException(int number) {

        this.number = number;
    }

    @Override
    public String toString() {
        return "예외 : " +this.number ;

    }

    public String getNumber() {
        return "메시지 : " +this.number ;
    }
}
