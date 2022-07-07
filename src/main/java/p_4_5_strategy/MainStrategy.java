package p_4_5_strategy;

public class MainStrategy {
    public static void main(String[] args) {

        Item i1 = new Item("TV", 2500);
        Item i2 = new Item("Tablet", 5000);

        IPayment paypal = new PaypalPeyment("mail@mail.com", "12345");
        IPayment creditCart = new CreditCartPayment("Ali", "1293129312", "123","2022");

        ShoppinCart shoppinCart = new ShoppinCart();
        shoppinCart.addItem(i1);
        shoppinCart.addItem(i2);

        shoppinCart.setPayment(creditCart);
        shoppinCart.pay();

    }
}
