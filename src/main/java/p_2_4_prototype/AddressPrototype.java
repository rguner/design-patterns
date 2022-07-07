package p_2_4_prototype;

public class AddressPrototype implements Cloneable{

    private String city;
    private String address;
    private String no;

    // For company
    private String title;
    private String email;

    // Note
    private AddressNote note;

    public AddressNote getNote() {
        return note;
    }

    public void setNote(AddressNote note) {
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void printAddress() {
        System.out.println( "Hash code : " + this.hashCode() );
        if ( title == null )
            System.out.println( city + " " + address + " " + no + " " + getNote().getNote() );
        else
            System.out.println( title + " " + " " + email + city + " " + address + " " + no + " " + getNote().getNote()  );
    }

}
