package ch06_abstract_interface.cartest;

public interface Speed {
    int ALLOWED_MAX_SPEED = 50 ;
    public abstract void speedup(int su) ; // 가속기
    public abstract void speeddown(int su) ; // 감속기
}
