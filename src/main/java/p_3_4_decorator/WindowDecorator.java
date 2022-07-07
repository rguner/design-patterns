package p_3_4_decorator;

public abstract class WindowDecorator implements HomePart {

    private HomePart window = new HomeWindow();

    public HomePart getWindow() {
        return window;
    }

    public void setWindow(HomePart window) {
        this.window = window;
    }
}
