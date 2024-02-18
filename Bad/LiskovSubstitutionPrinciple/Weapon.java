
public abstract class Weapon {
    protected boolean weaponLoaded;
    public Weapon(){
        weaponLoaded=false;
    }

    public abstract void reloadBullets();

    public void useAgain() {
        if (weaponLoaded) {
            System.out.println("Damaged weapon is reloaded and ready to use");
        }else{
            System.out.println("Damaged weapon isn't reloaded.");
        }
    }
}
