package p_3_abstract;

public abstract class Customer {

    abstract int customerNumber();

    public int total() {
        if ( customerNumber() == 10 ) {
            return 100000;
        }
        return 0;
    }

    public String name() {
        if ( customerNumber() == 10 ) {
            return "Erkan Bilsin";
        }
        return "";
    }

}
