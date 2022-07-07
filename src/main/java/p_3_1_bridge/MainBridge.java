package p_3_1_bridge;

public class MainBridge {
    public static void main(String[] args) {

        Inventory pencilInventory = new Pencil( new ProductionImpl1() );
        call( pencilInventory );

        pencilInventory = new Pencil( new ProductionImpl2() );
        call( pencilInventory );


        Inventory noteBookInventory = new Notebook(new ProductionImpl1());
        call( noteBookInventory );

        noteBookInventory = new Notebook( new ProductionImpl2() );
        call( noteBookInventory );

    }

    public static void call( Inventory inventory ) {
        inventory.produce();
    }

}
