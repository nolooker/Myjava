package ch10_collection;

public class HorseController implements VehicleController{
    @Override
    public void drive() {
        System.out.println("마차가 달립니다.");
    }
}
