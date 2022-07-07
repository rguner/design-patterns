package p_3_4_decorator;

public class BorderWindow extends WindowDecorator {

    @Override
    public void produce() {
        getWindow().produce();
        borderPixel(3);
    }

    private void borderPixel( int size ) {
        System.out.println( "borderPixel : " + size );
    }

}
