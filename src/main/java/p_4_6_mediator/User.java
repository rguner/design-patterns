package p_4_6_mediator;

public abstract class User {

    public int id;
    public String name;

    private IchatRoomMediator ichatRoomMediator;
    public User(IchatRoomMediator ichatRoomMediator) {
        this.ichatRoomMediator = ichatRoomMediator;
    }

    public void receiverMessage( String message ) {
        System.out.println( name + " - " + message );
    }

    public void sendMessage( String message, int userId ) {
        System.out.println( "new message: "+ name + " - " + message );
        ichatRoomMediator.sendMessage(message, userId);
    }



}
