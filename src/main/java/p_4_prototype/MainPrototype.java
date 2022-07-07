package p_4_prototype;

public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {


        final HomeAddress homeAddress = new HomeAddress("İstanbul", "Adres İst", "34", "İstanbul Notu");

        Object obj = homeAddress.clone();
        if ( obj instanceof  AddressPrototype ) {
            final AddressPrototype companyAddress = (AddressPrototype) obj;
            companyAddress.setCity("Ankara");
            companyAddress.setNo("06");
            companyAddress.setAddress("Ankara Adres");
            companyAddress.setTitle("X LTD.");
            companyAddress.setEmail("ltd@mail.com");
            //AddressNote nt = new AddressNote();
            //nt.setNote("companyAddress Note");
            //companyAddress.setNote( nt );
            System.out.println( "homeAddress :" + homeAddress.hashCode() );
            System.out.println( "companyAddress :" + companyAddress.hashCode() );

            homeAddress.printAddress();
            companyAddress.printAddress();
        }


    }
}
