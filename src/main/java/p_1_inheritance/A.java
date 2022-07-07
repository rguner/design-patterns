package p_1_inheritance;

public class A extends Base {

    @Override
    public void write() {
        int sm = sum(40,60);
        System.out.println( "A Write Call " + sm );
    }

    public int minus( int a, int b ) {
        if ( a > 5 ) {
            super.write();
        }
        return a - b;
    }

}
