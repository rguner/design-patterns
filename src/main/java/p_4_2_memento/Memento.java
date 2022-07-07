package p_4_2_memento;

public class Memento {

    private Object[] elements;

    public Memento( Object[] elements ) {
        setElements( elements );
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
