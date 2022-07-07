package p_4_6_mediator;

public class Main {
    public static void main(String[] args) {

        ChatRoomMediator mediator = new ChatRoomMediator();

        User ali = new ChatUser(mediator);
        ali.name = "Ali";
        ali.id = 1;

        User kemal = new ChatUser(mediator);
        kemal.name = "Kemal";
        kemal.id = 2;

        User zehra = new ChatUser(mediator);
        zehra.name = "Zehra";
        zehra.id = 3;

        mediator.addUserInroom(ali);
        mediator.addUserInroom(kemal);
        mediator.addUserInroom(zehra);

        ali.sendMessage("Selam", zehra.id);
        zehra.sendMessage("Merhaba", ali.id);

    }
}
