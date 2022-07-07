package p_2_3_builder;

public class SaleManager {

    private OrderBuilder builder;

    public Car createOrder( String brandName, String modelName, String  colorName, int power ) {
        if ( brandName.equals("audi") ) {
            builder = new AudiOrderBuilder();
        }else if ( brandName.equals("fiyat") ) {
            builder = new FiatOrderBuilder();
        }
        builder.setBrand(brandName);
        builder.setModel(modelName);
        builder.setColor(colorName);
        builder.setPower(power);
        return builder.getCar();
    }

    public void printOrder() {
        System.out.print( builder.getCar().getBrand() );
        System.out.print( builder.getCar().getModel());
        System.out.print( builder.getCar().getColor() );
        System.out.println( builder.getCar().getPower() );
    }


}
