package p_1_inheritance;


public class InheritanceMain {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        call(a);
        call(b);
        call(c);

    }

    public static void call( Base base ) {
        if ( base instanceof A ) {
            ((A) base).minus(10, 4);
        }
        base.write();
    }

}
