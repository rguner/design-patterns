package p_4_solid.openclose;

public class MainOpenClose {
    public static void main(String[] args) {

        MysqlDatabaseImpl mysqlDatabase = new MysqlDatabaseImpl();
        OracleDatabaseImpl oracleDatabase = new OracleDatabaseImpl();

        Product p1 = new Product();
        p1.setTitle("Tablet");

        Product p2 = new Product();
        p2.setTitle("TV");

        BasketManager.manager( mysqlDatabase, p1 );
        BasketManager.manager( oracleDatabase, p2 );


    }
}
