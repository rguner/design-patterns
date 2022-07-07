package p_3_abstract;

public class Person extends Customer {

    private int number = 0;
    public Person(int number) {
        this.number = number;
    }

    @Override
    int customerNumber() {
        return number;
    }

}
