package p_1_bridge;

public class ProductionImpl1 implements Production {

    private final Factory1 factory1 = new Factory1();

    @Override
    public void producePencil() {
        factory1.redProducePencil();
    }

    @Override
    public void produceNotebook() {
        factory1.redProduceNotebook();
    }
}
