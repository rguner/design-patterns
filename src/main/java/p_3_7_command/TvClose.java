package p_3_7_command;

public class TvClose implements Command {

    private TV tv = null;
    public TvClose( TV tv ) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.tvClose();
    }

}
