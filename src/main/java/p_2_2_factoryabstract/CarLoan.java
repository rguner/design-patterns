package p_2_2_factoryabstract;

public class CarLoan implements BaseLoan {

    @Override
    public String getType() {
        return "CarLoan";
    }
}
