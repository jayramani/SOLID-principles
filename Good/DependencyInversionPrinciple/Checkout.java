public class Checkout {

    private IUser userDiscount;
    private float amountPayable;

    public float calculateFinalAmount(IUser user,int discountPercentage,int price){
        float amountPayable = user.countDiscount(discountPercentage, price);
        return amountPayable;
    }
}


//    IUser user = new PremiumUser();
//    Checkout c = new Checkout();
//    c.calculateFinalAmount(user,discountpercentage,price);
//
//    This is how the discount amount for premium user will be counted in Main class.
