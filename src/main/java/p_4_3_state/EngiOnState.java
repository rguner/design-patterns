package p_4_3_state;

public class EngiOnState implements State {

    @Override
    public void on(Engine engine) {
        System.out.println( "Engine Status On" );
    }

    @Override
    public void off(Engine engine) {
        engine.setState( new EngineOffState() );
        System.out.println( "Engine OFF" );
    }

}
