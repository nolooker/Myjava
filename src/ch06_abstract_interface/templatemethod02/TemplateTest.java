package ch06_abstract_interface.templatemethod02;

public class TemplateTest {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        System.out.println();
        Animal alevel = new Kangaroo();
        player.upgradeLevel(alevel);
        player.play(2);

        System.out.println();
        Animal slevel = new Ostrich();
        player.upgradeLevel(slevel);
        player.play(3);
    }
}
