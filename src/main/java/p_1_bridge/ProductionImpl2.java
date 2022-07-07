package p_1_bridge;

public class ProductionImpl2  implements Production {

    private final Factory2 factory2 = new Factory2();

    @Override
    public void producePencil() {
        factory2.greenProducePencil();
    }

    @Override
    public void produceNotebook() {
        factory2.greenProduceNotebook();
    }
}