package p_4_decorator;

public class MainDecorator {
    public static void main(String[] args) {

        HomeWindow homeWindow = new HomeWindow();
        homeWindow.produce();

        BorderWindow borderWindow = new BorderWindow();
        borderWindow.produce();


    }
}
