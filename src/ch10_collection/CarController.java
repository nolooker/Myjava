package ch10_collection;

// 자동차 구현체
public class CarController implements VehicleController {
    @Override
    public void drive() {
        System.out.println("자동차가 달립니다.");
    }
}
