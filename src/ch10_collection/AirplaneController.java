package ch10_collection;

// 비행기 구현체
public class AirplaneController implements VehicleController {
    @Override
    public void drive() {
        System.out.println("비행기가 날아 다닙니다.");
    }
}
