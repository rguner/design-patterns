package p_4_1_iterator;

public class Fenerbahce  implements Team {

    private Player[] players = new Player[6];

    public Fenerbahce() {
        players[0] = new Player("Semih", 5);
        players[1] = new Player("Serkan", 35);
        players[2] = new Player("Berk", 65);
        players[3] = new Player("Fatih", 57);
        players[4] = new Player("Onur", 95);
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public Iterator getIterator() {
        return new ArrayIterator( getPlayers() );
    }

}
