package p_4_solid;

public class SingleUser {

    private String name;
    private String surname;
    private int age;

    public SingleUser() {
    }

    public SingleUser(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String profileName(int uid ) {
        if ( uid  == 10 )
            return "Serkan Bilsin";
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
