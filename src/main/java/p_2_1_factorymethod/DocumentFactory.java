package p_2_1_factorymethod;

public class DocumentFactory {

    public static Document createDocument( EDocumentType type ) throws Exception {
        if ( type == EDocumentType.PDF ) {
            return new PDF();
        }else if ( type == EDocumentType.WORD ) {
            return new Word();
        }
        throw new RuntimeException("not found");
    }


}
