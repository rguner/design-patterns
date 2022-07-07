package p_6_singleton;

public class Singleton {

    private static Singleton instanceObj = null;

    private static Object lock = new Object();

    public Singleton() {
        System.out.println("Singleton init");
    }

    public static Singleton instance() {
        if ( instanceObj == null ) {
            synchronized (lock) {
                instanceObj = new Singleton();
            }
        }
        return instanceObj;
    }


}
