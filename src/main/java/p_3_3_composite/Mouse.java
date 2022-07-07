package p_3_3_composite;

public class Mouse implements Part{
    @Override
    public String title() {
        return "Logitech Mouse";
    }

    @Override
    public int price() {
        return 400;
    }
}
