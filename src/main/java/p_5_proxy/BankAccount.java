package p_5_proxy;

public interface BankAccount {

    int withdrawMoney( int quantity );
    void depositMoney( int quantity );
    String getName();
    void setName(String name);


}
