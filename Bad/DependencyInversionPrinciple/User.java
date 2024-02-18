public class User {

    public float countDiscount(int discount,int price){
        int discountedAmount;
        discountedAmount=price-(price*(discount/100));
        return discountedAmount;
    }
}
