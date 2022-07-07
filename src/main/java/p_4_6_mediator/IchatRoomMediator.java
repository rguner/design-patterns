package p_4_6_mediator;

public interface IchatRoomMediator {

    void sendMessage(String message, int useId);
    void addUserInroom( User user );
}
