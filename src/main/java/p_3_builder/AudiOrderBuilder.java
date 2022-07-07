package p_3_builder;

public class AudiOrderBuilder extends OrderBuilder {

    @Override
    public void setBrand(String brandName) {
        getCar().setBrand(new Brand(brandName));
    }

    @Override
    public void setModel(String modelName) {
        getCar().setModel(new Model(modelName));
    }

    @Override
    public void setColor(String colorName) {
        getCar().setColor( colorName );
    }

    @Override
    public void setPower(int power) {
        getCar().setPower( power );
    }
}
