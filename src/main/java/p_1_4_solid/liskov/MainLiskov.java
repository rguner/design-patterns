package p_1_4_solid.liskov;

public class MainLiskov {
    public static void main(String[] args) {

        UsePDF usePDF = new UsePDF();
        usePDF.read();
        usePDF.sendMail();

        UseFile useFile = new UseFile();
        useFile.read();

    }
}
