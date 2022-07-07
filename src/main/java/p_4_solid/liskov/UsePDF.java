package p_4_solid.liskov;

public class UsePDF extends PdfPrint {

    @Override
    public void sendMail() {
        System.out.println("PDF Send Mail");
    }

    @Override
    public void read() {
        System.out.println("PDF Read");
    }

}
