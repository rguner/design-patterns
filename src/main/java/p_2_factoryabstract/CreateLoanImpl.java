package p_2_factoryabstract;

public class CreateLoanImpl implements  LoanAbstractFactory{


    @Override
    public BaseLoan getLoan(ELoanType type) {
       switch ( type ) {
           case CAR:
               return new CarLoan();
           case HOME:
               return new HomeLoan();
       }
        throw new RuntimeException("Not Type");
    }

    @Override
    public BaseBank getBank(EBankType type) {
        switch ( type ) {
            case GARANTI:
                return new GarantiBank();
            case IS:
                return new IsBank();
        }
        throw new RuntimeException("Not Type");
    }

}
