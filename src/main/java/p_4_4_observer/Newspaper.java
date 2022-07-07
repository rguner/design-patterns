package p_4_4_observer;

public interface Newspaper {

    void addSubscribe( Subscriber subscriber );
    void removeSubscriber( Subscriber subscriber );
    void sendNewspaper();
}
