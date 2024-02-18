
public class Checkout {

        private float amountPayable;
        private int discountPercentage;

        public float calculateFinalAmount(int discountPercentage,int price){
            User user = new User();
            float amountPayable = user.countDiscount(discountPercentage, price);
            return amountPayable;
        }
}
