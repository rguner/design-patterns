package p_3_6_flyweight;

public class MainFlyweight {
    public static void main(String[] args) {

        String line1 = "Erkana Bilsin";
        String line2 = "Serkan Biliyor";

        WordManager.instance().addLine(line1, 0);
        //WordManager.instance().addLine(line2, 1);

        WordManager.getAllWord();

    }
}
