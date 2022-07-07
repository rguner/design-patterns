package p_1_4_solid.openclose;

public class OracleDatabaseImpl implements IDatebase {

    @Override
    public void addBasket(Product product) {
        System.out.println( "Oracle Add : " + product );
    }

}