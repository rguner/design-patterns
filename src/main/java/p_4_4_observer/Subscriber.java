package p_4_4_observer;

public interface Subscriber {

    void update();
    void cancelSubscription();
    void subscribe( Newspaper newspaper );
}
