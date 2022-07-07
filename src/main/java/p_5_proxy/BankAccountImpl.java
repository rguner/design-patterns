package p_5_proxy;

public class BankAccountImpl implements BankAccount {

    private int quantity;
    private String name;
    public BankAccountImpl( int quantity, String name ) {
        this.quantity = quantity;
        this.name = name;
    }

    @Override
    public int withdrawMoney(int quantity) {
        if ( this.quantity - quantity > 0 ) {
            this.quantity =  this.quantity - quantity;
        }
        return this.quantity;
    }

    @Override
    public void depositMoney(int quantity) {
        this.quantity =  this.quantity + quantity;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
