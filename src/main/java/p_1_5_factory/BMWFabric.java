package p_1_5_factory;

public class BMWFabric extends CarFabric{

    @Override
    public void createCar() {
        getLs().add( new i120(100) );
        getLs().add( new i320( 150) );
    }

}
