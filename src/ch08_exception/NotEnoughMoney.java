package ch08_exception;

public class NotEnoughMoney extends Exception {
    public NotEnoughMoney(String message) {
        super(message);
    }
}
