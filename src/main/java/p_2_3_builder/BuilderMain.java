package p_2_3_builder;

public class BuilderMain {
    public static void main(String[] args) {

        SaleManager manager = new SaleManager();
        manager.createOrder("audi", "A5", "Black", 150);
        manager.printOrder();

        manager = new SaleManager();
        manager.createOrder("fiyat", "Double", "Black", 100);
        manager.printOrder();



    }
}
