package p_4_1_iterator;

public class MainIterator {
    public static void main(String[] args) {

        Tofas tofas = new Tofas();
        Iterator<Player> itTofas = tofas.getIterator();
        while (itTofas.hasNext() ) {
            Player player = itTofas.next();
            System.out.println( "Tofas : " + player.getName() + " " + player.getNo() );
        }


        Fenerbahce fenerbahce = new Fenerbahce();
        Iterator<Player> itFenerbahce = fenerbahce.getIterator();
        while (itFenerbahce.hasNext() ) {
            Player player =  itFenerbahce.next();
            System.out.println( "Fenerbahce : " + player.getName() + " " + player.getNo() );
        }

    }
}
