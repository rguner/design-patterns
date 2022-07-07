package p_1_factorymethod;

public class PDF implements Document {

    @Override
    public String documentType() {
        return "pdf";
    }

}
