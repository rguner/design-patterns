package p_6_adaptor;

public class CustomerAdaptor extends CustomerEntry implements CustomerCall {

    @Override
    public void call() {
        System.out.println("Call Line");
        entry();
    }

}
