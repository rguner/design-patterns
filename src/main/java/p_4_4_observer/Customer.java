package p_4_4_observer;

public class Customer implements Subscriber{

    private Newspaper newspaper;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Newspaper getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(Newspaper newspaper) {
        this.newspaper = newspaper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println( this.name +" Newspaper Send");
    }

    @Override
    public void cancelSubscription() {
        getNewspaper().removeSubscriber(this);
        System.out.println(this.name +" CancelSubscription");
    }

    @Override
    public void subscribe(Newspaper newspaper) {
        setNewspaper(newspaper);
        newspaper.addSubscribe(this);
        System.out.println(this.name +" subscribe");
    }
}
