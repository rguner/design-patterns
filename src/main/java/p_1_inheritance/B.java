package p_1_inheritance;

public class B extends Base {

    @Override
    public void write() {
        int sm = sum(23,55);
        System.out.println( "B Write Call " + sm );
    }

}
