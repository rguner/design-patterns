package p_4_4_observer;

import java.util.ArrayList;

public class Hurriyet implements Newspaper {

    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    public ArrayList<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(ArrayList<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void addSubscribe(Subscriber subscriber) {
        getSubscribers().add( subscriber );
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        getSubscribers().remove( subscriber );
    }

    @Override
    public void sendNewspaper() {
        for ( Subscriber item: getSubscribers() ) {
            item.update();
        }
    }
}
