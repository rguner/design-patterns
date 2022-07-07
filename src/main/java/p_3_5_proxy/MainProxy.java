package p_3_5_proxy;

public class MainProxy {
    public static void main(String[] args) {

        BankAccount account = new BankAccountImpl(5000, "Erkan Bilsin");

        account = new MyAccountProxy(account);
        account.depositMoney(2000);
        int total = account.withdrawMoney(500);
        System.out.println( account.getName() + " " + total );
        System.out.println("==========================");

        account = new DifferentPersonProxy(account);
        account.setName("Zehra Bilirim");
        account.depositMoney(500);
        total = account.withdrawMoney(2500);
        System.out.println( account.getName() + " " + total );

    }
}
