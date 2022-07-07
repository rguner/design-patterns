package p_1_6_singleton;

public class MainSingleton {
    public static void main(String[] args) {

        Singleton s1 = Singleton.instance();
        Singleton s2 = Singleton.instance();
        Singleton s3 = Singleton.instance();
        Singleton s4 = Singleton.instance();

        System.out.println( s1.getClass().hashCode() );
        System.out.println( s2.getClass().hashCode() );
        System.out.println( s3.getClass().hashCode() );
        System.out.println( s4.getClass().hashCode() );

    }
}
