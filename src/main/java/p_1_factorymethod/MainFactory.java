package p_1_factorymethod;

public class MainFactory {
    public static void main(String[] args) {

        try {
            Document doc = DocumentFactory.createDocument(EDocumentType.PDF);
            System.out.println( doc.documentType() );

            doc = DocumentFactory.createDocument(EDocumentType.WORD);
            System.out.println( doc.documentType() );


        }catch (Exception ex) {

        }

    }
}
