package p_3_7_command;

public class Control {

    private Command[] commands = new Command[2];
    public Control() {
        final TV tv = new TV();
        commands[0] = new TVOpen(tv);
        commands[1] = new TvClose(tv);
    }

    public void click( int index ) {
        if ( index > commands.length || index < 0 ) {
            throw new RuntimeException("index not found");
        }
        commands[index].execute();
    }

}
