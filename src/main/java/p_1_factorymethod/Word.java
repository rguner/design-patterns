package p_1_factorymethod;

public class Word implements Document {

    @Override
    public String documentType() {
        return "word";
    }

}
