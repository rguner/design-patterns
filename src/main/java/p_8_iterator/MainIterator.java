package p_8_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {

    public static void main(String[] args) {

        List<User> ls = new ArrayList<>();
        ls.add( new User() );
        ls.add( new User() );
        ls.add( new User() );

        for( User item : ls ) {
            System.out.println( item );
        }
        System.out.println( "============================" );

        Iterator<User> userIterable = ls.listIterator();
        ls.clear();
        while ( userIterable.hasNext() ) {
            User itm = userIterable.next();
            System.out.println( itm );
        }
        System.out.println( "============================" );
        while ( userIterable.hasNext() ) {
            User itm = userIterable.next();
            System.out.println( itm );
        }

    }

}
