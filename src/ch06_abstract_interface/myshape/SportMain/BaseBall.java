package ch06_abstract_interface.myshape.SportMain;

public class BaseBall extends Sport{

    private double hitrate ;

    public BaseBall(String name, int entry, double hitrate) {

        super(name, entry);
        this.hitrate = hitrate;


        if (hitrate >= 0.35) {
            super.result = "excellent";
        } else if (hitrate >= 0.32) {
            super.result = "very good";
        } else if (hitrate >= 0.28) {
            super.result = "good";
        } else if (hitrate >= 0.25) {
            super.result = "not bad";
        } else {
            super.result = "poor";
        }
    }

    @Override
    public String Display() {

        return result ;
    }
}
