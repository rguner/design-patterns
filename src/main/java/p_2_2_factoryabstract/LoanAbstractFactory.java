package p_2_2_factoryabstract;

public interface LoanAbstractFactory {

    BaseLoan getLoan( ELoanType type );
    BaseBank getBank( EBankType type );

}
