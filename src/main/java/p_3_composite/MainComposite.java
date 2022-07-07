package p_3_composite;

public class MainComposite {
    public static void main(String[] args) {

        final Computer computer = new Computer();

        Monitor monitor = new Monitor();
        Part keyboard = new Keyboard();
        Part mouse = new Mouse();
        Part ram1 = new Ram2();
        Part ram2 = new Ram2();

        computer.addPart(monitor);
        computer.addPart(keyboard);
        computer.addPart(mouse);
        computer.addPart(ram1);
        computer.addPart(ram2);

        // delete
        computer.removePart(ram2);
        computer.removePart(ram2);

        System.out.println( computer.title() );
        System.out.println( computer.price() );

        for( Part item : computer.getPartList() ) {
            System.out.println( item.title() + " - " + item.price() );
        }
    }
}
