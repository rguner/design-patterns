package p_2_facede;

public class FactoryComponent {

    private static FactoryComponent instance = new FactoryComponent();

    public FactoryComponent() {}

    public static FactoryComponent getIntance() {
        return instance;
    }

    public ComponentFacede getSub1Component() {
        return new Sub1Component();
    }

}
