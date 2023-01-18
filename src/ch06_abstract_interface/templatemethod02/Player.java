package ch06_abstract_interface.templatemethod02;

public class Player {
    private Animal level ;

    public Player() {
        level = new Rabbit();
        level.showInfo();
    }

    public void play(int count) {
        level.execute(count);
    }

    public void upgradeLevel(Animal level) {
        this.level = level ;
        level.showInfo();
    }
}
