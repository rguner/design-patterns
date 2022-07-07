package p_2_factoryabstract;

public class MainAbstract {
    public static void main(String[] args) {

        LoanAbstractFactory abs = new CreateLoanImpl();
        String type = abs.getBank(EBankType.GARANTI).getType();
        System.out.println( type );

    }
}
