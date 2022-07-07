package p_1_4_solid.openclose;

public class MysqlDatabaseImpl implements IDatebase {

    @Override
    public void addBasket(Product product) {
        System.out.println( "Mysql Add : " + product );
    }

}
