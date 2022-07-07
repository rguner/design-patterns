package p_2_1_factorymethod;

public class Word implements Document {

    @Override
    public String documentType() {
        return "word";
    }

}
