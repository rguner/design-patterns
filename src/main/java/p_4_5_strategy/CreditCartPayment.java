package p_4_5_strategy;

public class CreditCartPayment implements IPayment {

    private String name;
    private String cardNumber;
    private String cvv;
    private String date;

    public CreditCartPayment(String name, String cardNumber, String cvv, String date) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void pay(int amount) {
        System.out.println( "CreditCartPayment : " + amount );
    }

}
