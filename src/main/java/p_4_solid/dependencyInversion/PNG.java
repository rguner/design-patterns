package p_4_solid.dependencyInversion;

public class PNG implements IFiligran{
    @Override
    public void addFiligran(Filigran filigran) {
        filigran.createFligran("PNG");
    }
}
