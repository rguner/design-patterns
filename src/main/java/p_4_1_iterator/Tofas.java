package p_4_1_iterator;

import java.util.ArrayList;

public class Tofas implements Team {

    private ArrayList<Player> team;

    public Tofas() {
        team = new ArrayList<>();
        team.add( new Player("Ali", 10) );
        team.add( new Player("Serkan", 11) );
        team.add( new Player("Selim", 15) );
        team.add( new Player("Kemal", 30) );
        team.add( new Player("Burhan", 44) );
        team.add( new Player("Erdal", 13) );
    }

    @Override
    public Iterator getIterator() {
        return new ArrayListIterator(getTeam());
    }

    public ArrayList<Player> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Player> team) {
        this.team = team;
    }
}
