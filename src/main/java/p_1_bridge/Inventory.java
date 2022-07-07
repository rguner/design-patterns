package p_1_bridge;

public abstract class Inventory {

    private Production production;

    public Inventory( Production production ) {
        this.production = production;
    }

    public abstract void produce();

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
