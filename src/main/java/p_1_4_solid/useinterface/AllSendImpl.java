package p_1_4_solid.useinterface;

public class AllSendImpl implements  IAllSend{

    @Override
    public void sms_bip() {

    }

    @Override
    public void email_send() {

    }

    @Override
    public void sms_send() {
        System.out.println( "AllSend sms call" );
    }

}
