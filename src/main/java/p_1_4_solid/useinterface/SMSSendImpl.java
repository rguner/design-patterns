package p_1_4_solid.useinterface;

public class SMSSendImpl implements ISMS{

    @Override
    public void sms_send() {
        System.out.println( "SMSSend sms call" );
    }

}
