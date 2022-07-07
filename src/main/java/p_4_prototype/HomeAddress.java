package p_4_prototype;

public class HomeAddress extends AddressPrototype{

    public HomeAddress(String city, String address, String no, String noteTxt) {
        setCity(city);
        setAddress(address);
        setNo(no);
        AddressNote note = new AddressNote();
        note.setNote(noteTxt);
        setNote( note );
    }

}
