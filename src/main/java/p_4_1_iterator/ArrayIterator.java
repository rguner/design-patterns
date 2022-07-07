package p_4_1_iterator;

public class ArrayIterator implements Iterator{

    private Player[] players;
    private int possition;

    public Player[] getPlayers() {
        return players;
    }

    public ArrayIterator(Player[] players) {
        setPlayers( players );
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getPossition() {
        return possition;
    }

    public void setPossition(int possition) {
        this.possition = possition;
    }

    @Override
    public boolean hasNext() {
        if ( possition >= getPlayers().length || getPlayers()[possition] == null )
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        Player player = getPlayers()[possition];
        possition++;
        return player;
    }

}
