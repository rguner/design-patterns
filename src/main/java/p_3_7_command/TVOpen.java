package p_3_7_command;

public class TVOpen implements Command {

    private TV tv = null;
    public TVOpen( TV tv ) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tvOpen();
    }

}
