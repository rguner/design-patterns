package p_1_bridge;

public class Pencil extends Inventory {

    public Pencil(Production production) {
        super(production);
    }

    @Override
    public void produce() {
        getProduction().producePencil();
    }

}
