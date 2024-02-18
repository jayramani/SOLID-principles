
public abstract class WeaponUsingBullets extends Weapon {

    protected boolean weaponLoaded;

    public WeaponUsingBullets(){
        weaponLoaded=false;
    }

    public abstract void reloadBullets();

    public void use() {
        reloadBullets();
        if (weaponLoaded) {
            System.out.println("Damaged weapon is reloaded with bullets and ready to use");
        }else{
            System.out.println("Damaged weapon isn't reloaded.");
        }
    }
}
