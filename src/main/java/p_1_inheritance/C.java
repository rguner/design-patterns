package p_1_inheritance;

public class C extends Base {

    @Override
    public void write() {
        int sm = sum(22,66);
        System.out.println( "C Write Call " + sm );
    }

}
