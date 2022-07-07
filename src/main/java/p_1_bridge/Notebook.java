package p_1_bridge;

public class Notebook extends Inventory {

    public Notebook(Production production) {
        super(production);
    }

    @Override
    public void produce() {
        getProduction().produceNotebook();
    }

}
