package p_4_1_iterator;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {

    private ArrayList<Player> players;
    private int possition;

    public ArrayListIterator( ArrayList<Player> players ) {
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
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
        if ( possition >= getPlayers().size() || getPlayers().get(possition) == null )
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        Player player = getPlayers().get(possition);
        possition++;
        return player;
    }

}
