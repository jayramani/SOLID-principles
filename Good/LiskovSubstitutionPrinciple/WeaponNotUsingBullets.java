public abstract class WeaponNotUsingBullets extends Weapon{

    protected boolean weaponSharped;

    public WeaponNotUsingBullets(){
        weaponSharped=false;
    }

    public abstract void sharpWeapon();

    public void use() {
        sharpWeapon();
        if (weaponSharped) {
            System.out.println("Damaged weapon is sharped and ready to use");
        }else{
            System.out.println("Damaged weapon isn't sharped.");
        }
    }
}
