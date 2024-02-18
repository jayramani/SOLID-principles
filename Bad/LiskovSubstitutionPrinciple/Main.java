public class Main {
    public static void main(String[] args) {

        Weapon weapon;

        weapon = new Akm();
        weapon.reloadBullets();
        weapon.useAgain();

        weapon = new Sword();
        weapon.reloadBullets();
        weapon.useAgain();

    }
}