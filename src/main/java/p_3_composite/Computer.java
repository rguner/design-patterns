package p_3_composite;

import java.util.ArrayList;
import java.util.List;

public class Computer implements Part {

    private List<Part> partList = new ArrayList<>();

    public List<Part> getPartList() {
        return partList;
    }

    public void setPartList(List<Part> partList) {
        this.partList = partList;
    }

    public void addPart( Part part ) {
        getPartList().add(part);
    }

    public void removePart( Part part ) {
        if ( getPartList().contains(part) ) {
            getPartList().remove( part );
        }
    }

    public Part getPart( int index ) {
        Part part = null;
        try {
            part = getPartList().get(index);
        }catch (Exception ex) {
            throw new NullPointerException("index not found");
        }
        return part;
    }

    @Override
    public String title() {
        return "Computer :" + this.hashCode();
    }

    @Override
    public int price() {
        int total = 0;
        for ( Part item : getPartList() ) {
            total += item.price();
        }
        return total;
    }

}
