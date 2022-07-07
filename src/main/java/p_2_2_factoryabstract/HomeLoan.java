package p_2_2_factoryabstract;

public class HomeLoan implements BaseLoan {

    @Override
    public String getType() {
        return "HomeLoan";
    }
}
