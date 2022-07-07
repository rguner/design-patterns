package p_1_4_solid.dependencyInversion;

public class FiligranManager {

    static void call( IFiligran filigran, Filigran flg ) {
        filigran.addFiligran(flg);
    }


}
