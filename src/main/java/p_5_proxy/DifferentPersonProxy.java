package p_5_proxy;

public class DifferentPersonProxy  implements  BankAccount {

    private BankAccount account;
    public DifferentPersonProxy( BankAccount account ) {
        this.account = account;
    }

    @Override
    public int withdrawMoney(int quantity) {
        return this.account.withdrawMoney(quantity);
    }

    @Override
    public void depositMoney(int quantity) {
        this.account.depositMoney(quantity);
    }

    @Override
    public String getName() {
        return account.getName();
    }

    @Override
    public void setName(String name) {
        account.setName( name );
    }
}
