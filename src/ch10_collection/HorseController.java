package ch10_collection;

// 마차 구현체
public class HorseController implements VehicleController {
    @Override
    public void drive() {
        System.out.println("마차가 달립니다.");
    }
}
