package p_2_3_builder;

public abstract class OrderBuilder {

    private Car car;
    public Car getCar() {
        if ( car == null ) {
            car = new Car();
        }
        return car;
    }

    public abstract void setBrand( String brandName );
    public abstract void setModel( String modelName );
    public abstract void setColor( String colorName );
    public abstract void setPower( int power );


}
