package p_4_6_mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomMediator implements IchatRoomMediator {

    private Map<Integer, User> hm = new HashMap<>();

    @Override
    public void sendMessage(String message, int useId) {
        User u = hm.get(useId);
        u.receiverMessage(message);
    }

    @Override
    public void addUserInroom(User user) {
        hm.put(user.id, user);
    }
}
