package p_1_4_solid.useinterface;

public class MainInterface {

    public static void main(String[] args) {

        IAllSend bip = new AllSendImpl();
        SMSSendImpl sms = new SMSSendImpl();

        call(bip);
        call(sms);
    }

    public static void call( ISMS sms ) {
        sms.sms_send();
    }

}
