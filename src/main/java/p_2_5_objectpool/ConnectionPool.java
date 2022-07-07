package p_2_5_objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    static List<Connection> connectionList = new ArrayList<>();

    public ConnectionPool() {
        init();
    }

    public void init () {
        for (int i = 0; i < 3; i++) {
            connectionList.add( new Connection() );
        }
    }

    static Connection getConnection() {
        if ( connectionList.size() == 0 ) {
            throw new RuntimeException("Not Object");
        }

        Connection instance = connectionList.get(0);
        connectionList.remove(0);
        return instance;
    }

    static void relase( Connection con ) {
        if ( con != null ) {
            connectionList.add(con);
        }
    }

}
