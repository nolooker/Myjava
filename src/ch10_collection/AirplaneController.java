package ch10_collection;

public class AirplaneController implements VehicleController{
    @Override
    public void drive() {
        System.out.println("비행기가 날아 다닙니다.");
    }
}
