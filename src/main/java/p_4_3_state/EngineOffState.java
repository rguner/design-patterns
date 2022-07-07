package p_4_3_state;

public class EngineOffState implements State {

    @Override
    public void on(Engine engine) {
        engine.setState( new EngiOnState() );
        System.out.println( "Engine ON" );
    }

    @Override
    public void off(Engine engine) {
        System.out.println( "Engine Status Off" );
    }
}
