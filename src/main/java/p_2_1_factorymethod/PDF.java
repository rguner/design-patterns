package p_2_1_factorymethod;

public class PDF implements Document {

    @Override
    public String documentType() {
        return "pdf";
    }

}
