package ch10_collection;

public class CarController implements VehicleController{
    @Override
    public void drive() {
        System.out.println("자동차가 달립니다.");
    }
}
