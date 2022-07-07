package p_4_2_memento;

import java.util.ArrayList;

public class Document {

    private ArrayList<String> lines = new ArrayList<>();

    public void addLine( int index, String line ) {
        getLines().add( index, line );
    }

    public void removeLine( int index ) {
        getLines().remove(index);
    }

    public Memento createMemento() {
        return new Memento(getLines().toArray() );
    }

    public void setMemento( Memento memento ) {
        getLines().clear();
        Object[] tempLines = memento.getElements();
        for ( Object item : tempLines ) {
            getLines().add( ""+item );
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for ( String item : getLines() ) {
            builder.append( item );
            builder.append( System.lineSeparator() );
        }
        return builder.toString();
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }
}
