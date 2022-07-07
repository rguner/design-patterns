package p_1_4_solid.dependencyInversion;

public class JPG implements IFiligran  {

    @Override
    public void addFiligran(Filigran filigran) {
        filigran.createFligran("JPG");
    }

}
