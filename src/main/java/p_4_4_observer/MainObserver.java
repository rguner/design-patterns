package p_4_4_observer;

public class MainObserver {
    public static void main(String[] args) {

        Customer cus1 = new Customer("Kemal Bil");
        Customer cus2 = new Customer("Zehra Bilsin");
        Customer cus3 = new Customer("Ayşe Bilki");

        Hurriyet hurriyet = new Hurriyet();
        cus1.subscribe(hurriyet);
        cus2.subscribe(hurriyet);
        cus3.subscribe(hurriyet);

        System.out.println("=======================");
        hurriyet.sendNewspaper();

        System.out.println("=======================");
        cus2.cancelSubscription();
        hurriyet.sendNewspaper();
    }
}
